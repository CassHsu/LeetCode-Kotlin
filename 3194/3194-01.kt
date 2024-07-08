class Solution {
    fun minimumAverage(nums: IntArray): Double {
        val sorted = nums.sorted()

        var ans = sorted.first() + sorted.last()

        var i = 1
        var j = sorted.size - 2

        while (i < j) {
            ans = min(ans, sorted[i] + sorted[j])
            i++
            j--
        }

        return (ans / 2.0)
    }
}
