class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        var ret = mutableListOf<Int>()
        for (i in left..right) {
            if (check(i)) ret.add(i)
        }
        return ret
    }
    
    fun check(num: Int): Boolean {
        var d = num
        while (d > 0) {
            var r = d % 10
            d = d / 10
            if (r == 0 || num % r != 0) return false
        }
        return true;
    }
}
