class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val ms = mutableMapOf<Char, Int>()
        val mt = mutableMapOf<Char, Int>()
        
        for (i in 0..s.length - 1) {
            if (ms.containsKey(s[i]) == false) ms[s[i]] = i
            if (mt.containsKey(t[i]) == false) mt[t[i]] = i
            
            if (ms[s[i]] != mt[t[i]]) return false
        }
        
        return true
    }
}
