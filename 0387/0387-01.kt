class Solution {
    fun firstUniqChar(s: String): Int {
        var m: MutableMap<Char, Int> = mutableMapOf()
        
        for (c in s) {
            m.put(c, m.getOrDefault(c, 0) + 1)
        }
        
        for (i in 0..s.length - 1) {
            if (m.getOrDefault(s[i], 0) == 1) return i
        }
        
        return -1
    }
}