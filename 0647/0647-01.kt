class Solution {
    var count = 0
    var size = 0
    
    fun towpointers(s: String, l: Int, r: Int) {
        var ll = l
        var rr = r
        while (ll >= 0 && rr < this.size && s[ll] == s[rr]) {
            this.count++
            ll--
            rr++
        }
    }
    
    fun countSubstrings(s: String): Int {
        this.size = s.length
        
        for (i in 0..this.size - 1) {
            this.towpointers(s, i, i)
            this.towpointers(s, i, i + 1)
        }
        
        return this.count    
    }
}
