class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val size = cost.size + 1
        val minCost = MutableList(size) {0}
        
        for (i in 2..size-1) {
            val s1 = minCost[i-1] + cost[i-1]
            val s2 = minCost[i-2] + cost[i-2]
            minCost[i] = Math.min(s1, s2)
        }
        return minCost[size - 1];
    }
}
