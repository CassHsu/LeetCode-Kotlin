class Solution {
    fun arraysIntersection(arr1: IntArray, arr2: IntArray, arr3: IntArray): List<Int> {
        val ans = mutableListOf<Int>()
        var p1 = 0
        var p2 = 0
        var p3 = 0
        
        while (p1 < arr1.size && p2 < arr2.size && p3 < arr3.size) {
            if (arr1[p1] == arr2[p2] && arr2[p2] == arr3[p3]) {
                ans.add(arr1[p1])
                p1++
                p2++
                p3++
                
            } else {
                if (arr1[p1] < arr2[p2]) {
                    p1++
                } else if (arr2[p2] < arr3[p3]) {
                    p2++
                } else {
                    p3++
                }
            }
        }
        
        return ans
    }
}
