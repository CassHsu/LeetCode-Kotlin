class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var ans = 0
        
        for (op in operations) {
            if (op == "--X" || op == "X--") ans--
            if (op == "++X" || op == "X++") ans++
        }
        
        return ans
    }
}
