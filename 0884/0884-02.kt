class Solution {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val countMap = mutableMapOf<String, Int>()
        val ans = mutableListOf<String>()
        
        s1.split(" ").forEach({
            countMap.put(it, countMap.getOrDefault(it, 0) + 1)
        });
        
        s2.split(" ").forEach({
            countMap.put(it, countMap.getOrDefault(it, 0) + 1)
        });
        
        for ((k, v) in countMap) {
            if (v == 1) ans.add(k);
        }
        
        return ans.toTypedArray()
    }
}
