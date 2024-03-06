class Solution {
    fun isAcronym(words: List<String>, s: String): Boolean {
        if (words.size != s.length) return false

        words.forEachIndexed({i, w ->
            if (w[0] != s[i]) return false
        })

        return true
    }
}
