class Solution {
    fun splitWordsBySeparator(words: List<String>, separator: Char): List<String> {
        var res = mutableListOf<String>()

        for (word in words) {
            var arr = word.split(separator)
            for (w in arr) {
                if (w != "") {
                    res.add(w)
                }
            }
        }

        return res
    }
}
