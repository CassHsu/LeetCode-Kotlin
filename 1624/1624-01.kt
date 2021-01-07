class Solution {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        val m = mutableMapOf<Char, Int>()
        var ans = -1
        
        for (i in 0..s.length - 1) {
            var c = s[i]
            if (m.getOrDefault(c, -1) != -1) {
                ans = Math.max(ans, i - m.getOrDefault(c, 0) - 1)
            } else {
                m[c] = i
            }
        }
        return ans
    }
}