class Solution {
    fun totalMoney(n: Int): Int {
        var total: Int = 0
        val w: Int = n / 7
        val r: Int = n % 7
        var monday: Int = 1
        
        for (i in 1..w) {
            var tmp = monday
            for (j in 1..7) {
                total += tmp
                tmp++
            }
            monday++
        }
        
        var tmp = monday
        for (i in 1..r) {
            total += tmp
            tmp++
        }
        return total
    }
}