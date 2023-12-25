class Solution {
    fun buyChoco(prices: IntArray, money: Int): Int {
        var res = money
        var step = 0
        var size = prices.size
        Arrays.sort(prices)

        for (p in prices) {
            if (p <= res) {
                res -= p
                step += 1

                if (step == 2) return res
            } else return money
        }
        return money
    }
}
