class Solution {
    fun replaceDigits(s: String): String {
        var ret = s.toCharArray()
        for (i in 1..s.length-1 step 2) {
            ret[i] = shift(s[i-1], s[i])
        }
        return String(ret)
    }
    
    fun shift(c: Char, x: Char): Char {
        return ((c - '0') + x.toInt()).toChar()
    }
}
