class Solution {
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        val ret = mutableListOf<Int>()
        var lines = 1
        var width = 0
        
        for (i in 0..s.length - 1) {
            val w = widths[s[i] - 'a']
            width += w
            
            if (width > 100) {
                lines++
                width = w
            }
        }
        
        ret.add(lines)
        ret.add(width)
        return ret.toIntArray()
    }
}
