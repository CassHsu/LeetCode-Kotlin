class Solution {
    fun minCostToMoveChips(position: IntArray): Int {
        var even = 0
        var odd = 0
        
        for (v in position) {
            if (v % 2 == 0) even++
            else odd++
        }
        
        return Math.min(even, odd)
    }
}
