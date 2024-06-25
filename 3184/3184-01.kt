class Solution {
    fun countCompleteDayPairs(hours: IntArray): Int {
        var count = 0;
        var size = hours.size - 1;

        for (i in 0..size) {
            for (j in i+1..size) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
