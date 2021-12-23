class Solution {
    fun countLetters(s: String): Int {
        var count = 1
        var dp = 1
        
        for (i in 1..s.length - 1) {
            if (s[i-1] == s[i]) dp++
            else dp = 1
            
            count += dp
        }
        
        return count
    }
}
