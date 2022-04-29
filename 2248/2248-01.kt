class Solution {
    fun intersection(nums: Array<IntArray>): List<Int> {
        val res = mutableListOf<Int>()
        val count = IntArray(1001)
        
        for (n in nums) {
            for (i in n) {
                count[i]++
            }
        }
        
        for (i in 0..1000) {
            if (count[i] == nums.size) {
                res.add(i)
            }
        }
        
        return res
    }
}
