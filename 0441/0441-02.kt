class Solution {
    fun arrangeCoins(n: Int): Int {
        var k = 1
        var m = n
        
        while (m >= k) {
            m -= k
            k++
        }
        
        return k - 1
    }
}
