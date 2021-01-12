class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        var p = 1
        for (i in 1..31) {
            if (p == n) return true
            p *= 3
        }
        return false
    }
}