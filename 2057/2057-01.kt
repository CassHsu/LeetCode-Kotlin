class Solution {
    fun smallestEqual(nums: IntArray): Int {
        for (i in 0..nums.size - 1) {
            if (nums[i] == i % 10) return i
        }
        return -1
    }
}
