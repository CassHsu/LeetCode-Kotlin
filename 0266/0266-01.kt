class Solution {
    fun canPermutePalindrome(s: String): Boolean {
        var count = 0
        val m = mutableMapOf<Char, Int>()
        
        for (c in s) {
            m.set(c, m.getOrDefault(c, 0) + 1)
        }
        
        for ((_, v) in m) {
            count += v % 2
        }
        
        return count <= 1
    }
}
