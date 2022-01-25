class Solution {
    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        var count = 0
        val m = mutableMapOf<String, Int>()
        
        for (w in words1) {
            m[w] = m.getOrDefault(w, 0) + 1
        }
        
        for (w in words2) {
            if (m.containsKey(w) && m[w]!! < 2) {
                m[w] = m[w]!!.minus(1)
            }
        }
        
        println(m)
        for (w in words1) {
            if (m[w] == 0) count++
        }
        
        return count
    }
}
