class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        return this.buildit(s) == this.buildit(t)
    }
    
    fun buildit(st: String): String {
        val r: Stack<Char> = Stack()
        for (c in st) {
            if (c == '#') {
                if (r.size > 0) {
                    r.pop()
                }
            } else {
                r.push(c)
            }
        }
        
        return r.toString()
    }
}
