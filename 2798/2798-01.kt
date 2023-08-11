class Solution {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        var count = 0

        for (h in hours) {
            if (h >= target) count++
        }

        return count
    }
}
