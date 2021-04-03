class Solution {
    fun partitionLabels(S: String): List<Int> {
        var last = mutableMapOf<Char, Int>()
        var ans = mutableListOf<Int>()
        
        for (i in 0..S.length-1) {
            last.put(S[i], i);
        }
        
        var j = 0
        var anchor = 0
        for (i in 0..S.length-1) {
            j = Math.max(j, last.getOrDefault(S[i], 0))
            if (i == j) {
                ans.add(i - anchor + 1)
                anchor = i + 1
            }
        }
        return ans
    }
}
