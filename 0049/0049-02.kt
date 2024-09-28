class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        
        for (str in strs) {
            val sortedStr = str.toCharArray().sorted().joinToString("")
            map.computeIfAbsent(sortedStr) { mutableListOf() }.add(str)
        }
        
        return map.values.toList()
    }
}
