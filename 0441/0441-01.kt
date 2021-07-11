class Solution {
    fun arrangeCoins(n: Int): Int {
        var count: Long = 0L
        var ln = n.toLong()
        
        for (i in 1..n) {
            count += i
            
            if (count > n) {
                return i - 1
            } else if (ln == count){
                return i
            }
            
        }
        
        return 0
    }
}
