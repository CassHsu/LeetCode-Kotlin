class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val m = mutableMapOf<Int, Int>()
        var max = 0
        var count = 0

        for (n in nums) {
            var f = m.getOrDefault(n, 0).plus(1)
            if (f == max) count++
            else if (f > max) {
                max = f
                count = 1
            }
            m[n] = f
        }

        return max * count
    }
}
