class Solution {
    fun maximizeSum(nums: IntArray, k: Int): Int {
        var ans = 0
        val mx = nums.max()!!

        for (i in 0..k - 1) {
            ans += mx
            ans += i
        }

        return ans
    }
}
