class Solution {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        return words.indices.filter { index ->
            x in words[index]
        }
    }
}
