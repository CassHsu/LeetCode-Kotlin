class Solution {
    fun validPalindrome(s: String): Boolean {
        var l: Int = 0
        var r: Int = s.length - 1
        
        while (l < r) {
            if (s[l] != s[r]) {
                return this.inPalindrome(s, l + 1, r) || this.inPalindrome(s, l, r - 1)
            }
            l++
            r--
        }
        
        return true
    }
    
    fun inPalindrome(s: String, left: Int, right: Int): Boolean {
        var i = left
        var j = right
        
        while (i < j) {
            if (s[i] != s[j]) return false
            i++
            j--
        }
        
        return true
    }
}
