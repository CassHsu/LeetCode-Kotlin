class Solution {
    fun makeEqual(words: Array<String>): Boolean {
        val n = words.size
        val counts = IntArray(26) { 0 }
        
        for (w in words) {
            for (c in w) {
                counts[c - 'a']++
            }
        }
        
        for (c in counts) {
            if (c % n != 0) return false
        }
        
        return true
    }
}
