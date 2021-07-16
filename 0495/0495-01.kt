class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var count = duration
        
        for (i in 1..timeSeries.size - 1) {
            val diff = timeSeries[i] - timeSeries[i - 1]
            
            count += duration
            if (diff < duration) {
                count -= duration - diff
            }
        }
        
        return count
    }
}
