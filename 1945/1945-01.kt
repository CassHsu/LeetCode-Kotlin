class Solution {
    fun getLucky(s: String, k: Int): Int {
        var count = k
        var ts = convert(s)
        
        while (count > 0) {
            ts = transform(ts)
            count--
        }
        
        return ts.toInt()
    }
    
    fun convert(s: String): String {
        val sb = StringBuffer()
        for (c in s) {
            sb.append(((c - 'a') + 1).toString())
        }
        return sb.toString()
    }
    
    fun transform(s: String): String {
        var sum = 0
        for (c in s) {
            sum += (c - '0')
        }
        
        return sum.toString()
    }
}
