class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount == 0 || coins.size == 0) {
            return 0
        }
        val cache = IntArray(amount + 1)
        Arrays.fill(cache, amount + 1)
        cache[0] = 0
        
        for (c in coins) {
            for (i in c until amount+1) {
                cache[i] = Math.min(cache[i - c] + 1, cache[i])
            }
        }
        
        var res = cache[amount]
        if (res >= amount + 1) {
            res = -1
        }
        return res
    }
}