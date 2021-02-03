class Solution {
    fun countAndSay(n: Int): String {
        if (n == 1) return "1"
        
        val cs = countAndSay(n - 1)
        var res = ""
        var initC = cs[0]
        var count = 0
        
        for (c in cs) {
            if (c == initC) {
                count++
            } else {
                res += count.toString() + initC
                count = 1
                initC = c
            }
        }
        
        res += count.toString() + initC
        return res
    }
}