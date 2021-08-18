class Solution {
    var s: String = ""
    var ans: MutableList<ArrayList<String>> = arrayListOf()
    
    fun partition(s: String): List<List<String>> {
        this.s = s;
        
        this.backtrack(arrayListOf(), 0)
        return this.ans
    }
    
    fun backtrack(curr: ArrayList<String>, start: Int) {
        if (start >= this.s.length) {
            this.ans.add(ArrayList(curr))
            return
        }
        
        for (end in start..this.s.length - 1) {
            val tmp = this.s.substring(start, end + 1)
            if (tmp == tmp.reversed()) {
                curr.add(tmp)
                this.backtrack(curr, end + 1)
                curr.removeAt(curr.lastIndex)
            }
        }
    }
}
