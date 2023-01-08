class Solution {
    fun detectCapitalUse(word: String): Boolean {
        if (word == word.toUpperCase()) return true
        if (word == word.toLowerCase()) return true
        if (word == word[0] + word.substring(1).toLowerCase()) return true
        return false
    }
}
