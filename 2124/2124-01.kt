class Solution {
    fun checkString(s: String): Boolean {
        var a = 0
        var b = s.length
        
        for (i in 0..s.length - 1) {
            if (s[i] == 'a') {
                a = i
            } else if (b == s.length) {
                b = i
            }
        }
        
        return a <= b
    }
}
