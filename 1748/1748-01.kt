class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        var m = mutableMapOf<Int, Int>()
        var ans = 0
        
        for (n in nums) {
            val v = m[n]
            if (v == null) {
                m[n] = 1
            } else {
                m[n] = v + 1
            }
        }
        
        for (k in m.keys) {
            if (m[k] == 1) {
                ans += k
            }
        }
        
        return ans
    }
}
