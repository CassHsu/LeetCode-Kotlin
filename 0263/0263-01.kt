class Solution {
    fun isUgly(n: Int): Boolean {
        if (n == 0) return false
        var num: Int = n
        
        val uglys: IntArray = intArrayOf(2, 3, 5)
        for (u in uglys) {
            while (num % u == 0) {
                num /= u;
            }
        }
        return num == 1
    }
}
