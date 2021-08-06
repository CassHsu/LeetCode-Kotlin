class Solution {
    fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
        var w1 = ""
        var w2 = ""
        var wt = ""
        
        for (w in firstWord) {
            w1 += (w - 'a')
        }
        
        for (w in secondWord) {
            w2 += (w - 'a')
        }
        
        for (w in targetWord) {
            wt += (w - 'a')
        }
        
        return w1.toInt() + w2.toInt() == wt.toInt()
    }
}
