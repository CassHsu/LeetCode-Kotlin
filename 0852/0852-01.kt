class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var pv = arr[0]
        var pi = 0
        
        for (i in 1..arr.size - 1) {
            if (arr[i] > pv) {
                pi = i
                pv = arr[i]
            }
        }
        
        return pi
    }
}
