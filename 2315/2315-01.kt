class Solution {
    fun countAsterisks(s: String): Int {
        var count = 0
        var bars = 0
        
        for (c in s.toCharArray()) {
            when (c) {
                '*' -> {
                    if (bars % 2 == 0) count++
                }
                '|' -> bars++
            }
        }
        
        return count
    }
}
