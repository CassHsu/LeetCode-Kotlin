class Solution {
    fun addDigits(num: Int): Int {
        if (num == 0) return 0
        
        var n = num
        while (n >= 10) {
            n = n / 10 + n % 10   
        }
        return n
    }
}
