class Solution {
    val W = '0'
    val L = '1'
    var ROW = 0
    var COL = 0
    
    fun numIslands(grid: Array<CharArray>): Int {
        ROW = grid.size
        if (ROW <= 0) return 0
        
        COL = grid[0].size
        var islands = 0
        
        grid.forEachIndexed { r, row ->
            row.forEachIndexed { c, value ->
                if(grid[r][c] == L) {
                    islands += dfs(grid, r, c)
                }
            }
        }
        
        return islands
    }
    
    fun dfs(grid: Array<CharArray>, r: Int, c: Int): Int {
        if (r < 0 || c < 0 || r >= ROW || c >= COL || grid[r][c] != L) return 0
        
        grid[r][c] = W
        dfs(grid, r+1, c)
        dfs(grid, r, c+1)
        dfs(grid, r-1, c)
        dfs(grid, r, c-1)
        
        return 1
    }
}