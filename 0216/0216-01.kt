class Solution {
    val ans: MutableList<ArrayList<Int>> = arrayListOf()
    var k: Int = 0
    var n: Int = 0
    
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        this.k = k
        this.n = n
        
        this.backtrack(arrayListOf(), 1, n)
        return this.ans
    }
    
    fun backtrack(curr: ArrayList<Int>, start: Int, remain: Int) {
        if (curr.size == this.k) {
            if (remain == 0) {
                this.ans.add(ArrayList(curr))
            }
            return
        }
        
        for (i in start..9) {
            curr.add(i)
            this.backtrack(curr, i + 1, remain - i)
            curr.removeAt(curr.lastIndex)
        }
    }
}
