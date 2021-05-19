class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val ret = MutableList(0) {MutableList(0) {0}}
        
        for (i in 0..rowIndex) {
            var row = MutableList(i+1) {1}
            
            for (j in 1..i-1) {
                row[j] = ret[i-1][j-1] + ret[i-1][j]
            }
            ret.add(row)
        }
        return ret[rowIndex]
    }
}
