class Solution {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val countMap = mutableMapOf<String, Int>()
        val ans = mutableListOf<String>()
        
        for (w in s1.split(" ").toTypedArray()) {
            countMap.put(w, countMap.getOrDefault(w, 0) + 1)
        }
        
        for (w in s2.split(" ").toTypedArray()) {
            countMap.put(w, countMap.getOrDefault(w, 0) + 1)
        }
        
        for ((k, v) in countMap) {
            if (v == 1) ans.add(k);
        }
        
        return ans.toTypedArray()
    }
}
