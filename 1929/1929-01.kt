class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        var ans = IntArray(n * 2) {0}
        
        for (i in 0..n - 1) {
            ans[i] = nums[i]
            ans[i + n] = nums[i]
        }
        
        return ans
    }
}
