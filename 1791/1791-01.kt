class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        var center = 1
        val num = edges.size
        
        for (i in 1..num + 1) {
            var count = 0
            
            for (e in edges) {
                if (e[0] != i && e[1] != i) break
                count++
            }
            
            if (count == num) {
                center = i
                break
            }
        }
        
        return center
    }
}
