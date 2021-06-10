class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var ret = mutableListOf<Int>()
        
        for (i in 0..arr.size - 2) {
            var max = arr[i+1]
            for (j in i+1..arr.size - 1) {
                max = Math.max(max, arr[j])    
            }
            ret.add(max)
        }
        
        ret.add(-1)
        return ret.toIntArray()
    }
}
