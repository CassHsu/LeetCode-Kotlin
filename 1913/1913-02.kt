class Solution {
    fun maxProductDifference(nums: IntArray): Int {
        var (a, b, c, d) = listOf(Int.MAX_VALUE, Int.MAX_VALUE, 0, 0)
        for (n in nums) {
            if (n <= a) { b = a; a = n; } else if (n <= b) { b = n; }
            if (d <= n) { c = d; d = n; } else if (c <= n) { c = n; }
        }
        return c * d - a * b
    }
}
