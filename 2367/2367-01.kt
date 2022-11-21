class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        var count = 0
        val s = mutableSetOf<Int>()

        for (n in nums) {
            if (s.contains(n - diff) && s.contains(n - diff - diff)) {
                count++
            }
            s.add(n)
        }

        return count
    }
}
