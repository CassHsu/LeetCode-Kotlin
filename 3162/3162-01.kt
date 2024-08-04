class Solution {
    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {
        var count = 0

        for (n1 in nums1) {
            for (n2 in nums2) {
                if (n1 % (n2 * k) == 0) count++
            }
        }
        
        return count
    }
}
