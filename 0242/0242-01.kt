class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        
        var m = mutableMapOf<Char, Int>()
        for (c in s) {
            m[c] = m.getOrDefault(c, 0) + 1
        }
        
        for (c in t) {
            m[c] = m.getOrDefault(c, 0) - 1
        }
        
        for ((k, v) in m) {
            if (v != 0) return false
        }
        
        return true
    }
}