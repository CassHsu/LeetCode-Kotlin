class Solution {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        val counts = IntArray(26)
        
        for (w in word1) {
            counts[w - 'a']++
        }
        
        for (w in word2) {
            counts[w - 'a']--
        }
        
        for (c in counts) {
            if (c > 3 || c < -3) return false
        }
        
        return true
    }
}
