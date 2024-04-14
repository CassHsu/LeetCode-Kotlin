class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var seconds = 0
        val n = tickets.size
        val queue = IntArray(n)

        while (queue[k] < tickets[k]) {
            for (i in 0..n - 1) {
                if (queue[k] == tickets[k] && i > k)
                    break

                if (queue[i] < tickets[i]) {
                    queue[i] += 1
                    seconds += 1
                }
            }
        }
        return seconds
    }
}
