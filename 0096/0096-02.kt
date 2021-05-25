class Solution {
    fun numTrees(n: Int): Int {
        var cache = IntArray(n+1).apply({ set(0, 1) }).apply({set(1, 1)})
        
        for (i in 2..n) {
            for (j in 1..i) {
                cache[i] += cache[j-1] * cache[i-j]
            }
        }
        return cache[n]
    }
}
