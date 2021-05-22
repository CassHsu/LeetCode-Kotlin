class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var ks = mutableSetOf<Int>()
        for ((i, n) in nums.withIndex()) {
            if (ks.contains(n)) return true
            ks.add(n)
            if (ks.size > k) ks.remove(nums[i-k])
        }
        return false
    }
}
