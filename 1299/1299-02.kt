class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val ret = arr
        var max = arr[arr.size - 1]
        arr[arr.size - 1] = -1
        
        for (i in arr.size - 2 downTo 0) {
            val tmp = max
            if (arr[i] > max) max = arr[i]
            arr[i] = tmp
        }
        return ret
    }
}
