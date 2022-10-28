class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        var w1 = ""
        var w2 = ""
        for (w in word1) w1 += w
        for (w in word2) w2 += w
        
        return w1 == w2
    }
}
