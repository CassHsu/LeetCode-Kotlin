class Solution {
    fun sortSentence(s: String): String {
        val ss = s.split(" ")
        val ret = mutableListOf<String>()
        
        for (i in 0..ss.size - 1) {
            ret.add("")
        }
        
        for (w in ss) {
            val i = w[w.length - 1] - '0'
            ret[i - 1] = w.substring(0, w.length - 1)
        }
        
        return ret.joinToString(" ")
    }
}
