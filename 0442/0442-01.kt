class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        var m = mutableMapOf<Int, Int>()
        var ret = mutableListOf<Int>()
        
        for (n in nums) {
            if (m.get(n) == null) {
                m.put(n, 1)
            } else {
                if (m.get(n) == 1) {
                    ret.add(n)
                }
                m.put(n, m.getOrDefault(n, 0) + 1)
            }
        }
        return ret
    }
}
