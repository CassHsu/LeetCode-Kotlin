class Solution {
    fun hIndex(citations: IntArray): Int {
        var size = citations.size
        for (h in size downTo 1) {
            var i = size - h
            if (citations[i] >= h) return h
        }
        return 0
    }
}
