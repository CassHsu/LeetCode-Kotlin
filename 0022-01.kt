class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val ret = ArrayList<String>()
        bracktrack(ret, charArrayOf(), 0, 0, n)
        return ret
    }
    
    fun bracktrack(ret: ArrayList<String>, str: CharArray, left: Int, right: Int, n: Int) {
        if (str.size == 2*n) {
            ret.add(String(str))
            return
        }
        
        if (left > right) {
            bracktrack(ret, str.plus(')'), left, right + 1, n)
        }
        
        if (left < n) {
            bracktrack(ret, str.plus('('), left + 1, right, n)
        }
    }
}
