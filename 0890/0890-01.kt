class Solution {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        var res: MutableList<String> = mutableListOf<String>()
        val p = findPattern(pattern)
        
        for (w in words) {
            if (p == findPattern(w)) {
                res.add(w)
            }
        }
        
        return res.toList()
    }
    
    fun findPattern(pattern: String): String {
        var code: String = ""
        var i: Int = 0
        var pm: MutableMap<Char, Int> = mutableMapOf<Char, Int>()
        
        for (p in pattern) {
            if (pm[p] == null) {
                pm[p] = i
                i++
            }
            code += pm[p]
        }
        
        return code
    }
}
