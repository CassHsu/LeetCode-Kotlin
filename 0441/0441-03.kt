class Solution {
    fun arrangeCoins(n: Int): Int {
        var l: Long = 0
        var r: Long = n.toLong()
        
        while (l <= r) {
            var m = l + (r - l) / 2
            var curr = m * (m + 1) / 2
            
            if (curr.toInt() == n) return m.toInt()
            
            if (n < curr) {
                r = m - 1
            } else {
                l = m + 1
            }
        }
        
        return r.toInt()
    }
}
