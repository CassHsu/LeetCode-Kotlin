class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        var last = 0
        for (g in gain) {
            last = last + g
            if (last > max) max = last
        }
        return max
    }
}
