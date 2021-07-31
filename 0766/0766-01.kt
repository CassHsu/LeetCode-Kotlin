class Solution {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        val m = mutableMapOf<Int, Int>()
        
        for ((r, row) in matrix.withIndex()) {
            for ((c, v) in row.withIndex()) {
                if (m[r - c] != null) {
                    if (m[r - c] != v) return false
                } else {
                    m[r - c] = v
                }
            }
        }
        
        return true
    }
}
