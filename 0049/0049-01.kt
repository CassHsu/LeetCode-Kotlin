class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var m = mutableMapOf<String, MutableList<String>>()
        
        for (s in strs) {
            val k = s.toCharArray().sorted().joinToString("")
            if (m.containsKey(k) == false) {
                m[k] = mutableListOf<String>()
            }
            m[k]?.add(s)
        }
        
        return m.values.toList()
    }
}
