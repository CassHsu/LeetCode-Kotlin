class Solution {
    fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
        var count = 0
        val m = mutableMapOf<Int, Int>()
        
        for (n1 in nums1) {
            for (n2 in nums2) {
                val n = n1 + n2
                if (m.containsKey(n)) {
                    m.put(n, m.get(n)!!.plus(1))
                } else {
                    m.put(n, 1)
                }
            }
        }
        
        for (n3 in nums3) {
            for (n4 in nums4) {
                val n = -(n3 + n4)
                if (m.containsKey(n)) {
                    count += m.get(n)!!
                }
            }
        }
        
        return count
    }
}
