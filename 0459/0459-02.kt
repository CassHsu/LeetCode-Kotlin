class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        val size = s.length
        for (i in size/2 downTo 1) {
            if (size % i == 0) {
                val repeat = size / i
                val substr = s.substring(0, i)
                var curr = ""
                
                for (j in 1..repeat) {
                    curr += substr
                }
                
                if (s.equals(curr)) return true
            }   
        }
        return false
    }
}
