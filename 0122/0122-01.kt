class Solution {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        val size = prices.size
        for (i in 1..size-1) {
            val pf = prices[i] - prices[i-1]
            if (pf > 0) res += pf
        }
        return res
    }
}