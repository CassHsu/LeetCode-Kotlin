class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        var max = 0
        
        for (s in sentences) {
            val count = s.split(" ").size
            max = Math.max(max, count)
        }
        
        return max
    }
}
