class Solution {
    fun largestLocal(grid: Array<IntArray>): Array<IntArray> {
        val m = grid.size
        val n = grid[0].size
        val res: Array<IntArray> = Array<IntArray>(m - 2) { IntArray(n - 2) }
        
        for (r in 0..m - 3) {
            for (c in 0..n - 3) {
                val v1 = Math.max(grid[r][c], Math.max(grid[r][c + 1], grid[r][c + 2]))
                val v2 = Math.max(grid[r + 1][c], Math.max(grid[r + 1][c + 1], grid[r + 1][c + 2]))
                val v3 = Math.max(grid[r + 2][c], Math.max(grid[r + 2][c + 1], grid[r + 2][c + 2]))
                
                res[r][c] = Math.max(v1, Math.max(v2, v3))
            } 
        }
        
        return res
    }
}
