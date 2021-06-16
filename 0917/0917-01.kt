class Solution {
    fun reverseOnlyLetters(s: String): String {
        val ret = mutableListOf<Char>()
        var j = s.length - 1
        
        for (i in 0..s.length - 1) {
            if (s[i].isLetter()) {
                while (s[j].isLetter() == false) {
                    j--
                }
                ret.add(s[j--])
                
            } else {
                ret.add(s[i])
            }
        }
        return ret.joinToString("")
    }
}
