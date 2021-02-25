class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val lenS1 = s1.length;
        val lenS2 = s2.length;
        
        if (lenS1 > lenS2) return false;
        
        var countS1 = Array<Int>(26) {0}
        for (i in 0..lenS1 - 1) {
            countS1[s1[i] - 'a']++
        }
        
        for (i in 0..lenS2 - lenS1) {
            var countS2 = Array<Int>(26) {0}
            for (j in 0..lenS1-1) {
                countS2[s2[i + j] - 'a']++
            }
            
            if (match(countS1, countS2)) return true
        }
        
        return false
    }
    
    fun match(c1: Array<Int>, c2: Array<Int>): Boolean {
        for (i in 0..25) {
            if (c1[i] != c2[i]) return false
        }
        return true
    }
}
