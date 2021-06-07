class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if (words.size != pattern.length) return false
        
        val mp = mutableMapOf<Char, String>()
        val mw = mutableMapOf<String, Char>()
        
        for (i in 0..words.size-1) {
            val p = pattern[i]
            val w = words[i]
            
            if (mp.containsKey(p) == false) {
                mp[p] = w
            } else {
                if (mp[p] != w) return false
            }
            
            if (mw.containsKey(w) == false) {
                mw[w] = p
            } else {
                if (mw[w] != p) return false
            }
        }
        return true
    }
}
