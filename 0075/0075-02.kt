class Solution {
    fun sortColors(nums: IntArray): Unit {
        var count = mutableListOf(0, 0, 0)
        for (n in nums) {
            count[n]++
        }
        
        val len = nums.size - 1
        for (i in 0..len) {
            if (count[0] > 0) {
                nums[i] = 0
                count[0]--
                
            } else if (count[1] > 0) {
                nums[i] = 1
                count[1]--
                
            } else {
                nums[i] = 2
            }
        }
    }
}