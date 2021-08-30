class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
        var count = nums[0]
        var ans = nums[0]
        
        for (i in 1..nums.size - 1) {
            if (nums[i] > nums[i-1]) {
                count += nums[i]
            } else {
                count = nums[i]
            }
            
            ans = Math.max(ans, count)
        }
        
        return ans
    }
}
