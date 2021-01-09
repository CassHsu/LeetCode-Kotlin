class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        var p = 1
        for (i in 0..30) {
            if (n == p) return true
            p *= 2
        }
        
        return false
    }
}