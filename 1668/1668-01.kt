class Solution {
    fun maxRepeating(sequence: String, word: String): Int {
        var repeat = word
        var count = 0
        
        while (sequence.contains(repeat)) {
            count++
            repeat += word
        }
        
        return count
    }
}