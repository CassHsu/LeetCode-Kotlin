class Solution {
    fun reverse(x: Int): Int {
        var n = x
        var ans: Long = 0

        while (n != 0) {
            ans = (ans * 10) + (n % 10)
            n /= 10
        }

        if (ans > Int.MAX_VALUE || ans < Int.MIN_VALUE) {
            return 0
        }

        return ans.toInt()
    }
}
