class Solution {
    fun findUnsortedSubarray(nums: IntArray): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        
        for (i in 1..nums.size-1) {
            if (nums[i] < nums[i-1]) {
                min = Math.min(min, nums[i]);
            }
        }
        
        for (i in nums.size-2 downTo 0) {
            if (nums[i] > nums[i+1]) {
                max = Math.max(max, nums[i]);
            }
        }
        
        var r = nums.size - 1
        var l = 0
        
        while (l < nums.size && min >= nums[l]) {
            l++
        }
        
        while (r > 0 && max <= nums[r]) {
            r--
        }
        
        if (r - l > 0) {
            return r - l + 1
        } else return 0
    }
}
