class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for (i in 0..n - 1) {
            nums1[i + m] = nums2[i]
        }
        
        nums1.sort()
    }
}
