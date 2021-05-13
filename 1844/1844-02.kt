class Solution {
    fun replaceDigits(s: String): String {
        var ret = s.toCharArray()
        for (i in 0..s.length-1) {
            if (i % 2 != 0) {
                ret[i] = shift(s[i-1], s[i])
            }
        }
        return String(ret)
    }
    
    fun shift(c: Char, x: Char): Char {
        return ((c - '0') + x.toInt()).toChar()
    }
}
