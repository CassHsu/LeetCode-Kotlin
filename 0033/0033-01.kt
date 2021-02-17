class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        var mid = 0
        
        while (start <= end) {
            if (nums[start] == target) return start
            if (nums[end] == target) return end
            
            mid = (start + end) / 2
            
            if (nums[mid] == target) return mid
            
            if (target > nums[start] && nums[mid] > target) {
                end = mid - 1
            } else if (target > nums[mid] && nums[end] > target) {
                start = mid + 1
            } else if (nums[mid] > nums[end]) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return -1
    }
}