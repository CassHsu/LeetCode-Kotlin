class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var size = s.size
        if (size == 0) return 0

        g.sort()
        s.sort()

        var ans = 0;
        var si = size - 1;
        var gi = g.size - 1;
        while (si >= 0 && gi >= 0) {
            if (s[si] >= g[gi]) {
                ans++
                si--
                gi--
            } else {
                gi--
            }
        }
        return ans
    }
}
