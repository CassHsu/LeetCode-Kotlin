class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        var ret = mutableListOf<Int>()
        for (i in left..right) {
            if (check(i)) ret.add(i)
        }
        return ret
    }
    
    fun check(num: Int): Boolean {
        var str = num.toString()
        for (s in str) {
            if ('0'.equals(s) || num % Character.getNumericValue(s) != 0) return false
        }
        return true;
    }
}
