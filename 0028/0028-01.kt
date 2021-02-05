class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val nSize = needle.length
        val hSize = haystack.length
        if (nSize == 0 || haystack == needle) return 0
        
        val diff = hSize - nSize
        var p = 0
        while (p <= diff) {
            if (haystack.substring(p, p + nSize) == needle) {
                return p
            } else {
                p++
            }
        }
        
        return -1
    }
}