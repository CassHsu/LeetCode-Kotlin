class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        if (sentence.length < 26) return false
        
        val s = mutableSetOf<Char>()
        for (c in sentence) {
            s.add(c)
        }
        
        return s.size == 26
    }
}
