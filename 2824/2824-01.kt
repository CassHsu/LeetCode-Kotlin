class Solution {
    fun countPairs(nums: List<Int>, target: Int): Int {
        var count = 0

        for (i in nums.indices) {
            for (j in i + 1..nums.size - 1) {
                if ((nums[i] + nums[j]) < target) {
                    count++
                }
            }
        }

        return count
    }
}
