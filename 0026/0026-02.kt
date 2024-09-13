class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var newIdx = 0
        for (i in 1 until nums.size) {
            if (nums[i] != nums[newIdx]) {
                newIdx++
                nums[newIdx] = nums[i]
            }
        }

        return newIdx + 1
    }
}
