class Solution {
    fun climbStairs(n: Int): Int {
        val cache = IntArray(n+1)
        return climb1or2(0, n, cache)
    }
    
    fun climb1or2(i: Int, n: Int, cache: IntArray): Int {
        if (i > n) return 0
        if (i == n) return 1
        if (cache[i] > 0) return cache[i]
        
        cache[i] = climb1or2(i+1, n, cache) + climb1or2(i+2, n, cache)
        return cache[i]
    }
}
