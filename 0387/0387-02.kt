class Solution {
    fun firstUniqChar(s: String): Int {
        val charCount = mutableMapOf<Char, Int>()

        for (c in s) {
            charCount[c] = charCount.getOrDefault(c, 0) + 1
        }

        for (i in s.indices) {
            if (charCount[s[i]] == 1) {
                return i
            }
        }

        return -1
    }
}
