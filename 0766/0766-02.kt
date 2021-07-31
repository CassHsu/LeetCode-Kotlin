class Solution {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {        
        for ((r, row) in matrix.withIndex()) {
            for ((c, v) in row.withIndex()) {
                if (r > 0 && c > 0 &&  v != matrix[r - 1][c - 1])
                    return false
            }
        }
        
        return true
    }
}
