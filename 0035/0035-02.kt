class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var right = 0
        var left = nums.size
        while (right != left) {
            var mid: Int = (right + left) / 2
            if (target == nums[mid]) return mid
            if (target > nums[mid]) right = mid + 1
            else left = mid
        }
        return left
    }
}