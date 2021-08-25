class Solution {
    val ans: MutableList<ArrayList<Int>> = arrayListOf()
    
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        var path: ArrayList<Int> = arrayListOf()
        path.add(0)
        
        backtrack(graph, path, 0)
        return this.ans
    }
    
    fun backtrack(graph: Array<IntArray>, path: ArrayList<Int>, curr: Int) {
        if (curr + 1 == graph.size) {
            this.ans.add(ArrayList(path))
            return
        }
        
        for (n in graph[curr]) {
            path.add(n)
            backtrack(graph, path, n)
            path.removeAt(path.lastIndex)
        }
    }
}
