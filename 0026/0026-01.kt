class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val size = nums.size
        if (size <= 1) return size
        var p = 0
        for (i in 1..size-1) {
            if (nums[i] != nums[p]) {
                p += 1
                nums[p] = nums[i]
            }
        }
        return p + 1
    }
}