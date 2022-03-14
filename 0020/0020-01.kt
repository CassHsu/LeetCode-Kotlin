class Solution {
    fun isValid(s: String): Boolean {
        if (s.length == 0) return true
        
        val stack = mutableListOf<Char>()
        val m = mutableMapOf<Char, Char>()
        m.put('(', ')')
        m.put('[', ']')
        m.put('{', '}')
        
        for (c in s) {
            if (stack.size > 0 && m[stack.last()] == c) {
                stack.removeAt(stack.size - 1)
            } else {
                stack.add(c)
            }
        }
        
        return stack.size == 0
    }
}
