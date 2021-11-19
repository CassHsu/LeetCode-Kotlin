class Solution {
    fun getMaximumGenerated(n: Int): Int {
        if (n == 0) return 0
        
        val dp = IntArray(n + 1)
        dp[1] = 1
        
        val m = (n + 1) / 2
        var max = 1
        for (i in 1..m - 1) {
            val ii = i * 2
            
            dp[ii] = dp[i]
            dp[ii + 1] = dp[i] + dp[i + 1]
            
            if (dp[ii + 1] > max) max = dp[ii + 1]
        }
        
        return max
    }
}
