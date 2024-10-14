class Solution {
    fun singleNumber(nums: IntArray): Int {
        val seen = mutableSetOf<Int>()
        var sum = 0

        for (num in nums) {
            if (seen.contains(num)) {
                sum -= num
            } else {
                seen.add(num)
                sum += num
            }
        }
        return sum
    }
}
