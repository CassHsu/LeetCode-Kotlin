class Solution {
    fun maximumCount(nums: IntArray): Int {
        var p = 0
        var n = 0

        for (num in nums) {
            if (num > 0) {
                p++
                continue
            }
            if (num < 0) {
                n++
                continue
            }
        }
        
        if (p > n) return p
        return n
    }
}
