class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        if (num <= 0) return false
        
        var sum = 0
        val half = num shr 1
        var i = 1
        while (i <= half) {
            if (num % i == 0) {
                sum += i
            }
            i++
        }
        
        return sum == num
    }
}
