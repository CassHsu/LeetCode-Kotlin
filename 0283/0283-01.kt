class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var p = 0
        for (i in 0..nums.size - 1) {
            if (nums[i] != 0) {
                if (i != p) {
                    nums[i] = nums[p].also { nums[p] = nums[i] }
                }
                p++
            }
        }
    }
}