class Solution {
    fun findMaxK(nums: IntArray): Int {
        var max = -1
        val m = mutableMapOf<Int, Int>()
        
        for (n in nums) {
            if (m.containsKey(n)) m[n] = m[n]!!.plus(1)
            else m[n] = 1
        }
        
        for (n in nums) {
            if (n > 0 && m.containsKey(-n) && n > max) {
                max = n
            }
        }
        
        return max
    }
}
