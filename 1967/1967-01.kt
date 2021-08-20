class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var count = 0
        
        for (p in patterns) {
            if (word.contains(p)) count++
        }
        
        return count
    }
}
