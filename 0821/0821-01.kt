class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val ans = IntArray(s.length) {0}
        var prev = Int.MIN_VALUE / 2
        
        for (i in 0..s.length - 1) {
            if (s[i] == c) prev = i
            ans[i] = i - prev
        }
        
        prev = Int.MAX_VALUE / 2
        for (i in s.length - 1 downTo 0 step 1) {
            if (s[i] == c) prev = i
            ans[i] = Math.min(ans[i], prev - i)
        }
        
        return ans
    }
}
