class Solution {
    fun differenceOfSums(n: Int, m: Int): Int {
        var s1 = 0
        var s2 = 0
        for (i in 1..n) {
            if (i % m == 0) {
                s2 += i
            } else {
                s1 += i
            }
        }
        return s1 - s2
    }
}
