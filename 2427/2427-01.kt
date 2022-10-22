class Solution {
    fun commonFactors(a: Int, b: Int): Int {
        var count = 1
        val min = Math.min(a, b)
        
        for (n in 2..min) {
            if (a % n == 0 && b % n == 0) {
                count++
            }
        }
        
        return count
    }
}
