class Solution {
    fun minOperations(nums: IntArray): Int {
        var count = 0
        var prev = 0
        for (n in nums) {
            if (prev >= n) {
                prev++
                count += prev - n
            } else {
                prev = n
            }
        }
        return count
    }
}
