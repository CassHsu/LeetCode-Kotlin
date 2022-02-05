class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        var ans = mutableListOf<Int>()
        val pn = p.length
        val sn = s.length
        
        if (sn < pn) return ans
        
        val pa = IntArray(26)
        val sa = IntArray(26)
        
        val a = 'a'
        for (i in 0..pn - 1) {
            pa[p[i] - a] += 1
        }
        
        for (i in 0..sn - 1) {
            sa[s[i] - a] += 1
            
            if (i >= pn) {
                sa[s[i - pn] - a] -= 1
            }
            
            if (isEqual(pa, sa)) ans.add(i - pn + 1)
        }
        
        return ans
    }
    
    fun isEqual(pa: IntArray, sa: IntArray): Boolean {
        for (i in 0..25) {
            if (pa[i] != sa[i]) return false
        }
        
        return true
    }
}
