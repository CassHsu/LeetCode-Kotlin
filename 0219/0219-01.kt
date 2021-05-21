class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var map = mutableMapOf<Int, Int>()
        for ((i, n) in nums.withIndex()) {
            if (map[n] != null && i <= map[n]!!) {
                return true
            }
            map[n] = i + k
        }
        return false
    }
}
