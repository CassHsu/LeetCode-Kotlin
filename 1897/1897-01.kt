class Solution {
    fun makeEqual(words: Array<String>): Boolean {
        val n = words.size
        val m = mutableMapOf<Char, Int>()
        
        for (w in words) {
            for (c in w) {
                m.set(c, m.getOrDefault(c, 0).plus(1))
            }
        }
        
        for (kv in m) {
            if (kv.value % n != 0) return false
        }
        
        return true
    }
}
