class Solution {
    private val cache = mutableMapOf<Int, Int>()
    
    fun numTrees(n: Int): Int {
        if (n == 0) return 1
        
        if (cache.contains(n)) return cache.getValue(n)
        
        var ans = 0
        for (i in 1..n) {
            ans += numTrees(i - 1) * numTrees(n - i)
        }
        
        cache[n] = ans
        return ans
    }
}
