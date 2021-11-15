class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var ans = 0
        val n = tickets.size
        val count = tickets[k]
        
        for (r in 0..count - 1) {
            for (c in 0..n - 1) {
                if (r == count - 1 && c > k) break
                if (tickets[c] > 0) {
                    tickets[c]--
                    ans++
                }
            }
        }
        
        return ans 
    }
}
