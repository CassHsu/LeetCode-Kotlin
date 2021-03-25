class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var m = mapOf("type" to 0, "color" to 1, "name" to 2)
        var count = 0
        for (item in items) {
            if (item[m.getOrDefault(ruleKey, 0)] == ruleValue) {
                count++
            }
        }
        return count
    }
}
