class Solution {
    fun unequalTriplets(nums: IntArray): Int {
        var count = 0
        var end = nums.count() - 1
        for (i in 0..end) {
            for (j in i..end) {
                for (k in j..end) {
                    if (nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]) {
                        count++
                    }
                }
            }
        }

        return count
    }
}
