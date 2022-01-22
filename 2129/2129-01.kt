class Solution {
    fun capitalizeTitle(title: String): String {
        val words = title.split(" ")
        val ans = mutableListOf<String>()
        
        for (w in words) {
            if (w.length <= 2) {
                ans.add(w.toLowerCase())
            } else {
                ans.add(w[0].toUpperCase() + w.substring(1).toLowerCase())
            }
        }
        
        return ans.joinToString(" ")
    }
}
