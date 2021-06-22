class Solution {
    fun calPoints(ops: Array<String>): Int {
        val stack = java.util.Stack<Int>()
        
        for (op in ops) {
            if (op == "+") {
                val last1 = stack.pop()
                val last2 = stack.pop()
                val newtop = last1 + last2
                stack.push(last2)
                stack.push(last1)
                stack.push(newtop)
                
            } else if (op == "C") {
                stack.pop()
            } else if (op == "D") {
                stack.push(2 * stack.peek())
            } else {
                stack.push(op.toInt())
            }
        }
        
        var ans = 0
        for (s in stack) {
            ans += s
        }
        return ans
    }
}
