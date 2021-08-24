class Solution {
    var ans: MutableList<ArrayList<Int>> = arrayListOf()
    var n: Int = 0
    var k: Int = 0
    
    fun combine(n: Int, k: Int): List<List<Int>> {
        this.n = n
        this.k = k
        
        backtrack(arrayListOf(), 1)
        return this.ans
    }
    
    fun backtrack(curr: ArrayList<Int>, start: Int) {
        if (curr.size == k) {
            this.ans.add(ArrayList(curr))
            return
        }
        
        for (i in start..n) {
            curr.add(i)
            backtrack(curr, i + 1)
            curr.removeAt(curr.lastIndex)
        }
    }
}
