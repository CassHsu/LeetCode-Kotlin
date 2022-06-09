class Solution {
    fun removePalindromeSub(s: String): Int {
        if (s.isEmpty()) return 0
        if (s == s!!.reversed()) return 1
        
        return 2
    }
}
