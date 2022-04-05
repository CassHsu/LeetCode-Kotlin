class Solution {
    fun nextPermutation(nums: IntArray): Unit {
        var i = nums.size - 2
        while (i >= 0 && nums[i] >= nums[i + 1]) i--
        
        if (i >= 0) {
            var j = nums.size - 1
            while (nums[j] <= nums[i]) j--
            
            swap(nums, i, j)
        }
        
        reverse(nums, i + 1)
    }
    
    fun swap(nums: IntArray, i: Int, j: Int) {
        val t = nums[i]
        nums[i] = nums[j]
        nums[j] = t
    }
    
    fun reverse(nums: IntArray, start: Int) {
        var i: Int = start
        var j: Int = nums.size - 1
        
        while (i < j) {
            swap(nums, i, j)
            i++
            j--
        }
    }
}
