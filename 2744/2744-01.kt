class Solution {
    fun maximumNumberOfStringPairs(words: Array<String>): Int {
        var count = 0
        var n = words.size

        for (i in 0..n - 1) {
            for (j in i + 1..n - 1) {
                if (words[i].get(0) == words[j].get(1) && words[i].get(1) == words[j].get(0)) {
                    count++
                }
            }
        }

        return count
    }
}
