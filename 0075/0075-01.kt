class Solution {
    fun sortColors(nums: IntArray): Unit {
        var isConti = true
        var stop = 1
        while (isConti) {
            isConti = false
            val count = nums.size - stop - 1
            for (i in 0..count) {
                if (nums[i] > nums[i+1]) {
                    val tmp = nums[i+1]
                    nums[i+1] = nums[i]
                    nums[i] = tmp
                    isConti = true
                }   
            }
            stop++
        }
    }
}