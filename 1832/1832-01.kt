class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        if (sentence.length < 26) return false
        
        val m = mutableMapOf<Char, Int>()
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        for (a in alphabet) {
            m[a] = 0
        }
        
        for (s in sentence) {
            m.put(s, m[s]!! + 1)
        }
        
        for (v in m.values) {
            if (v == 0) return false
        }
        
        return true
    }
}
