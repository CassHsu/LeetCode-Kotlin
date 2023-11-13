class Solution {
    fun findChampion(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size

        for (i in 0..n - 1) {
            var sum = 0
            for (j in 0..m - 1) {
                sum += grid[i][j]
            }

            if (sum == n - 1) return i
        }
        
        return 0
    }
}
