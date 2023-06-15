class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0
        for (row in grid) {
            for (n in row) {
                if (n < 0) count++
            }
        }
        return count
    }
}
