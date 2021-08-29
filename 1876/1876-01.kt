class Solution {
    fun countGoodSubstrings(s: String): Int {
        var count = 0
        
        for (i in 1..s.length - 2) {
            if (s[i] != s[i - 1] && s[i] != s[i + 1] && s[i - 1] != s[i + 1]) {
                count++
            }
        }
        
        return count
    }
}
