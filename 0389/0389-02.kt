class Solution {
    fun findTheDifference(s: String, t: String): Char {
        val ms = mutableMapOf<Char, Int>()
        val mt = mutableMapOf<Char, Int>()
        
        for (i in 0..s.length -1) {
            val k = s[i]
            val v = ms.getOrDefault(k, 0)
            if (v == 0) {
                ms[k] = 1
            } else {
                ms[k] = v + 1
            }
        }
        
        for (i in 0..t.length - 1) {
            val k = t[i]
            val v = mt.getOrDefault(k, 0)
            if (v == 0) {
                mt[k] = 1
            } else {
                mt[k] = v + 1
            }
        }
        
        for ((k, v) in mt) {
            if (!ms.containsKey(k) || ms[k] != v) return k
        }
        
        return t[0]
    }
}
