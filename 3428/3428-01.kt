class Solution {
    fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
        var x = 0
        val d = Array(n) { IntArray(n) }
        
        for (i in 0 until n) {
            for (j in 0 until n) {
                d[i][j] = x
                x += 1
            }
        }

        var i = 0
        var j = 0

        for (c in commands) {
            when (c) {
                "RIGHT" -> j += 1
                "DOWN" -> i += 1
                "LEFT" -> j -= 1
                "UP" -> i -= 1
            }
        }

        return d[i][j]
    }
}
