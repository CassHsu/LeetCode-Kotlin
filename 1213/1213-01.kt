class Solution {
    val m = mutableMapOf<Int, Int>()
    
    fun arraysIntersection(arr1: IntArray, arr2: IntArray, arr3: IntArray): List<Int> {
        val ans = mutableListOf<Int>()
        
        arr1.forEach { countIt(it) }
        arr2.forEach { countIt(it) }
        arr3.forEach { countIt(it) }
        
        for ((k, v) in this.m) {
            if (v == 3) ans.add(k)
        }
        
        return ans
    }
    
    fun countIt(n: Int) {
        if (this.m.containsKey(n)) {
            this.m.put(n, this.m.get(n)!!.plus(1))
        } else {
            this.m.put(n, 1)
        }
    }
}
