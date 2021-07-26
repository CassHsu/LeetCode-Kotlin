class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var mode = -1
        
        for (i in 1..nums.size - 1) {
            if (nums[i -1] < nums[i]) {
                if (mode == 1) return false
                else mode = 0
            }
            
            if (nums[i - 1] > nums[i]) {
                if (mode == 0) return false
                else mode = 1
            }
        }
        
        return true
    }
}
