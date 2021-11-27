class Solution {
    fun removeVowels(s: String): String {
        var ans = ""
        
        for (c in s) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                ans += c
            }
        }
        
        return ans
    }
}
