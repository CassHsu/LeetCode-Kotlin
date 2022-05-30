class Solution {
    fun missingNumber(nums: IntArray): Int {
        var missing = nums.size
        
        for (i in 0..nums.size - 1) {
            var t = i xor nums[i]
            missing = missing xor t
        }
        
        return missing
    }
}
