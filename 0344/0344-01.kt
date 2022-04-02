class Solution {
    fun reverseString(s: CharArray): Unit {
        var l = 0
        var r = s.size - 1
        
        while (l < r) {
            var t = s[l]
            s[l] = s[r]
            s[r] = t
            
            l++
            r--
        }
    }
}
