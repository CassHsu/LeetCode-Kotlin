class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 0) return ""
        if (strs.size == 1) return strs[0]
        
        var prefix: String = strs[0]
        
        for (i in 1..strs.size-1) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix.isEmpty()) return ""
            }
        }
        return prefix
    }
}