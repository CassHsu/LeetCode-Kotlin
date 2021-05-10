class Solution {
    val cache = mutableMapOf<Int, Int>();
    
    fun minCostClimbingStairs(cost: IntArray): Int {
        return minCost(cost, cost.size)
    }
    
    fun minCost(cost: IntArray, i: Int): Int {
        if (i <= 1) return 0
        if (cache.containsKey(i)) return cache[i]!!
        
        val step1 = cost[i-1] + minCost(cost, i-1)
        val step2 = cost[i-2] + minCost(cost, i-2)
        cache[i] = Math.min(step1, step2)
        return cache[i]!!
    }
}
