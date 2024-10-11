class Solution {
    fun lengthOfLastWord(s: String): Int {
        val trimmed = s.trim()
        val lastSpaceIndex = trimmed.lastIndexOf(' ')
        
        return trimmed.length - lastSpaceIndex - 1
    }
}
