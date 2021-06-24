class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var l = 0
        var h = arr.size
        
        while (l < h) {
            val m = (l + h) / 2
            if (arr[m] < arr[m + 1]) {
                l = m + 1
            } else {
                h = m
            }
        }
        
        return l
    }
}
