class Solution {
    fun divideArray(nums: IntArray): Boolean {
        val pairs = nums.size / 2
        var count = 0
        val m = mutableMapOf<Int, Int>()
        
        for (n in nums) {
            val v = m[n] ?: 0
            m[n] = v + 1
        }
        
        for ((_, v) in m) {
            if (v % 2 == 0) {
                count += (v / 2)
            }
        }
        
        return count == pairs
    }
}
