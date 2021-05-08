class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val ret = MutableList(0) {MutableList(0) {0}}
        
        for (i in 0..numRows-1) {
            val row = MutableList(i+1) {1}
            
            for (j in 1..i-1) {
                row[j] = ret[i-1][j-1] + ret[i-1][j]
            }
            ret.add(row)
        }
        
        return ret
    }
}
