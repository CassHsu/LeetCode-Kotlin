class Solution {
    fun firstPalindrome(words: Array<String>): String {
        var ans = ""
        
        for (w in words) {
            if (isPaindrome(w)) {
                ans = w
                break
            }
        }
        
        return ans
    }
    
    fun isPaindrome(w: String): Boolean {
        var i = 0
        var j = w.length - 1
        
        while (i < j) {
            if (w[i] != w[j]) return false
            
            i++
            j--
        }
        
        return true
    }
}
