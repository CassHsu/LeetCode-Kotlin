class Solution {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val texts = text.split(" ")
        val size = texts.size
        
        if (brokenLetters == "") return size
        var ans = size
        
        for (t in texts) {
            for (i in 0..brokenLetters.length - 1) {
                if (t.contains(brokenLetters[i])) {
                    ans--
                    break
                }
            }
        }
        
        return ans
    }
}
