class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var count = 0

        for (n in nums) {
            if (n % 3 != 0) count++
        }

        return count
    }
}
