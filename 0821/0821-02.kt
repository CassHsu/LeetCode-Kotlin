class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val ans = IntArray(s.length) { Int.MAX_VALUE }

        var prev = -1
        for ((i, ch) in s.withIndex()) {
            if (ch == c) {
                prev = i
            }

            if (prev >= 0) {
                ans[i] = i - prev
            }
        }

        prev = -1
        for (i in (s.length - 1) downTo 0 step 1) {
            if (s[i] == c) {
                prev = i
            }
            if (prev >= 0) {
                ans[i] = Math.min(ans[i], prev - i)
            }
        }

        return ans
    }
}
