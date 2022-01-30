class Solution {
    fun countElements(nums: IntArray): Int {
        var count = 0
        val max = nums.max() ?: 0
        val min = nums.min() ?: 0
        
        for (n in nums) {
            if (max > n && n > min) count++
        }
        
        return count
    }
}
