class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var ans = 0
        var l = 0
        var r = mat.size - 1

        for (row in mat) {
            if (l == r) {
                ans += row[l]
            } else {
                ans += row[l]
                ans += row[r]
            }

            l++
            r--
        }

        return ans
    }
}
