class Solution {
    fun addDigits(num: Int): Int {
        if (num == 0) return 0
        val m9 = num % 9
        if (m9 == 0) return 9
        return m9
    }
}
