class Solution {
    fun countBits(num: Int): IntArray {
        var ret = mutableListOf<Int>()
        ret.add(0)
        for (i in 1..num) {
            var count = 0
            for (offset in 30 downTo 0) {
                val mask = 1 shl offset
                if ((i and mask) > 0) count++
            }
            ret.add(count)
        }
        return ret.toIntArray()
    }
}