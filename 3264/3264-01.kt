class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        repeat(k) {
            val n = findIndexOfMin(nums)
            nums[n] *= multiplier
        }
        return nums
    }

    private fun findIndexOfMin(nums: IntArray): Int {
        var minIndex = 0
        var minValue = nums[0]
        
        for (i in 1 until nums.size) {
            if (nums[i] < minValue) {
                minValue = nums[i]
                minIndex = i
            }
        }
        return minIndex
    }
}
