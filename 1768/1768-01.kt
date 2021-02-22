class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val s1 = word1.length
        val s2 = word2.length
        var w1 = s1
        var w2 = s2
        var i = 0
        var ret = StringBuffer()
        
        while (w1 > 0 && w2 > 0) {
            ret.append(word1[i])
            ret.append(word2[i])
            w1--
            w2--
            i++
        }
        
        if (w1 > 0) {
            while (i < s1) {
                ret.append(word1[i])
                i++
            }
        } else {
            while (i < s2) {
                ret.append(word2[i])
                i++
            }
        }
        
        return ret.toString()
    }
}
