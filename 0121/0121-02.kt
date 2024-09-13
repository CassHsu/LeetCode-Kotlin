class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0

        var minPrice = prices[0]
        var maxProfit = 0

        for (p in prices.drop(1)) {
            if (p < minPrice) {
                minPrice = p
            } else if (p - minPrice > maxProfit) {
                maxProfit = p - minPrice
            }
        }
        
        return maxProfit
    }
}
