class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        if (sentence.length < 26) return false
        
        val check = IntArray(26)
        for (s in sentence) {
            check[s - 'a']++
        }
        
        for (v in check) {
            if (v == 0) return false
        }
        
        return true
    }
}
