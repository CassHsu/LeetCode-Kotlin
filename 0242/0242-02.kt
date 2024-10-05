class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val sArray = s.toCharArray().sortedArray()
        val tArray = t.toCharArray().sortedArray()
        
        return sArray.contentEquals(tArray)
    }
}
