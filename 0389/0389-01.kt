class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var r = t[s.length].toInt()
        for (i in 0..s.length - 1) {
            r = r xor (s[i].toInt() xor t[i].toInt())
        }
        return r.toChar()
    }
}
