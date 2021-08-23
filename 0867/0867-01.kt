class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val ans = mutableListOf<IntArray>()
        val w = matrix[0].size
        val h = matrix.size
        
        for (c in 0..w-1) {
            val tmp = mutableListOf<Int>()
            for (r in 0..h-1) {
                tmp.add(matrix[r][c])
            }
            ans.add(tmp.toIntArray())
        }
        
        return ans.toTypedArray()
    }
}
