class Solution {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        var (mx, up, dn) = Triple(1, 1, 1)
        
        for (i in 1..nums.lastIndex) {
            up = if (nums[i] > nums[i - 1]) up + 1 else 1
            dn = if (nums[i] < nums[i - 1]) dn + 1 else 1
            mx = maxOf(mx, up, dn)
        }

        return mx
    }
}
