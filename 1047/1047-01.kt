class Solution {
    fun removeDuplicates(s: String): String {
        val stack = Stack<Char>()
        
        for (c in s) {
            if (stack.size > 0 && c.equals(stack.peek())) {
                stack.pop()
            } else {
                stack.push(c)
            }
        }
        
        val arr = stack.toCharArray()
        val res = String(arr)
        return res
    }
}
