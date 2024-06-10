class Solution {
    fun findPermutationDifference(s: String, t: String): Int {
        val m = IntArray(26)
        var ans = 0

        for (i in 0 until s.length) {
            m[s[i] - 'a'] = i
        }

        for (i in 0 until t.length) {
            ans += abs(m[t[i] - 'a'] - i)
        }
        return ans
    }
}
