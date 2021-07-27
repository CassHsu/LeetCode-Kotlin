class Solution {
    fun areOccurrencesEqual(s: String): Boolean {
        val m = mutableMapOf<Char, Int>()
        
        for (i in 0..s.length - 1) {
            val v = m[s[i]]
            if (v != null) m[s[i]] = v + 1
            else m[s[i]] = 1
        }
        
        val num = m[s[0]]
        for (v in m.values)
            if (num != v) return false
        
        return true
    }
}
