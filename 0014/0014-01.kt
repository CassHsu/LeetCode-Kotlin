class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val size = strs.size
        if (size == 0) return ""
        if (size == 1) return strs[0]
        
        if (strs[0] == "") return ""
        var prefix: String = strs[0]
        
        for (i in 1..size-1) {
            if (strs[i] == "") return ""
            
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix == "") return ""
            }
        }
        return prefix
    }
}