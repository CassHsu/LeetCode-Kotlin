class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min_price = prices[0]
        var max_prof = 0
        
        for (p in prices) {
            min_price = Math.min(min_price, p)
            max_prof = Math.max(max_prof, p - min_price)
        }
        
        return max_prof
    }
}
