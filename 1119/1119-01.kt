class Solution {
    fun removeVowels(s: String): String {
        var ans = ""
        val vowels = mapOf('a' to true, 'e' to true, 'i' to true, 'o' to true, 'u' to true)
        
        for (c in s) {
            if (!vowels.containsKey(c)) {
                ans += c
            }
        }
        
        return ans
    }
}
