class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        if (num < 0) return false
        
        var sum = 0
        var i = 1
        while (i * i <= num) {
            if (num % i == 0) {
                sum += i
                
                if (i * i != num) {
                    sum += num / i
                }
            }
            
            i++
        }
        
        return sum - num == num
    }
}
