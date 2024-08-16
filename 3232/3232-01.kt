class Solution {
    fun canAliceWin(nums: IntArray): Boolean {
        var s = 0
        var d = 0

        for (n in nums) {
            if (n.toString().length == 1) {
                s += n
            } else {
                d += n
            }
        }

        return s != d
    }
}
