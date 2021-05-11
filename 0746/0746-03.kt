class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var s1 = 0
        var s2 = 0
        
        for (i in 2..cost.size) {
            var tmp = s1
            s1 = Math.min(s1 + cost[i-1], s2 + cost[i-2])
            s2 = tmp
        }
        return s1
    }
}
