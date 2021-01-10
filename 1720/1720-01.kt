class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
        val ans = mutableListOf<Int>()
        ans.add(first)
        
        for (e in encoded) {
            ans.add(e xor ans[ans.size - 1])
        }
        
        return ans.toIntArray()
    }
}