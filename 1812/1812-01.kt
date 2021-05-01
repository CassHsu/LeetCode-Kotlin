class Solution {
    fun squareIsWhite(coordinates: String): Boolean {
        val x = (coordinates[0].toInt() - 'a'.toInt() + 1) % 2
        val y = (coordinates[1].toInt() - '0'.toInt()) % 2
        
        return x xor y == 1
    }
}
