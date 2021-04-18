class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        val size = s.length
        if (size == 0) return false
        
        var ss = s + s
        ss = ss.substring(1, size*2-1)
        
        return ss.contains(s)
    }
}
