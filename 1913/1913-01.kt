class Solution {
    fun maxProductDifference(nums: IntArray): Int {
        var sorted = nums.sortedArray()
        val n = nums.size
        return (sorted[n - 1] * sorted[n - 2]) - (sorted[0] * sorted[1])
    }
}
