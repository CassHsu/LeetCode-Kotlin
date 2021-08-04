class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val ans = mutableListOf<String>()
        val m = mapOf<Char, Int>(
            'q' to 0, 'w' to 0, 'e' to 0, 'r' to 0, 't' to 0, 'y' to 0, 'u' to 0, 'i' to 0, 'o' to 0, 'p' to 0,
            'Q' to 0, 'W' to 0, 'E' to 0, 'R' to 0, 'T' to 0, 'Y' to 0, 'U' to 0, 'I' to 0, 'O' to 0, 'P' to 0,
            'a' to 1, 's' to 1, 'd' to 1, 'f' to 1, 'g' to 1, 'h' to 1, 'j' to 1, 'k' to 1, 'l' to 1,
            'A' to 1, 'S' to 1, 'D' to 1, 'F' to 1, 'G' to 1, 'H' to 1, 'J' to 1, 'K' to 1, 'L' to 1,
            'z' to 2, 'x' to 2, 'c' to 2, 'v' to 2, 'b' to 2, 'n' to 2, 'm' to 2,
            'Z' to 2, 'X' to 2, 'C' to 2, 'V' to 2, 'B' to 2, 'N' to 2, 'M' to 2
        )
        
        for (word in words) {
            val initRow = m[word[0]]
            var isOneRow = true
            
            for (i in 1..word.length - 1) {
                if (m[word[i]] != initRow) {
                    isOneRow = false
                    break
                }
            }
            
            if (isOneRow) {
                ans.add(word)
            }
        }
        
        return ans.toTypedArray()
    }
}
