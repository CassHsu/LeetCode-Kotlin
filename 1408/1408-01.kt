class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val ans = mutableListOf<String>()
        
        words.forEachIndexed { i, w1 ->
            words.forEachIndexed { j, w2 ->
                if (i != j && w1.contains(w2) && !ans.contains(w2)) ans.add(w2)
            }
        }
        
        return ans
    }
}
