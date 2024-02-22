class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        var count1 = 0
        var count2 = 0

        for (n in nums1) {
            if (nums2.contains(n)) count1++
        }

        for (n in nums2) {
            if (nums1.contains(n)) count2++
        }

        return intArrayOf(count1, count2)
    }
}
