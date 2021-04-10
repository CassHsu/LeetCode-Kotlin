class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size
        for (i in 0..n-1) {
            for (j in i..n-1) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = tmp;
            }
        }
        
        for (row in matrix) {
            var i = 0
            var j = n - 1
            while (i < j) {
                var tmp = row[i]
                row[i] = row[j]
                row[j] = tmp
                
                i++
                j--
            }
        }
    }
}
