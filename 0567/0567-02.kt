class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {        
        if (s1.length > s2.length) return false;
        
        val a = 'a'
        var c1 = IntArray(26) {0}
        var c2 = IntArray(26) {0}
        for (i in 0..s1.length - 1) {
            c1[s1[i] - a]++
            c2[s2[i] - a]++
        }
        
        val w = s2.length - s1.length - 1
        for (i in 0..w) {
            if (matches(c1, c2)) return true
            
            c2[s2[i] - a]--
            c2[s2[i + s1.length] - a]++
        }
        return matches(c1, c2)
    }
    
    fun matches(c1: IntArray, c2: IntArray): Boolean {
        for (i in 0..25) {
            if (c1[i] != c2[i]) return false
        }
        return true
    }
}
