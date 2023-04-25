class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val w1 = word1.length
        val w2 = word2.length
        var i = 0
        var sb = StringBuffer()

        while (i < w1 || i < w2) {
            if (i < w1) sb.append(word1[i])
            if (i < w2) sb.append(word2[i])
            i++
        }

        return sb.toString()
    }
}
