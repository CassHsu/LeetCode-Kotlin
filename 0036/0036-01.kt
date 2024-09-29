class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val seen = HashSet<String>()

        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val num = board[i][j]
                if (num != '.') {
                    if (!seen.add("$num in row $i") || 
                        !seen.add("$num in column $j") || 
                        !seen.add("$num in box ${i / 3}-${j / 3}")) {
                        return false
                    }
                }
            }
        }

        return true
    }
}
