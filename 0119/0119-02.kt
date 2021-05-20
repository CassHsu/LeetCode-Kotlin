class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) return List(1) {1}
        if (rowIndex == 1) return List(2) {1}
        
        val last = getRow(rowIndex - 1)
        var row = MutableList(last.size + 1) {1}
        
        for (j in 1..last.size - 1) {
            row[j] = last[j-1] + last[j]
        }
        return row
    }
}
