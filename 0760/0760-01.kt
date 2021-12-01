class Solution {
    fun anagramMappings(nums1: IntArray, nums2: IntArray): IntArray {
        val ans = IntArray(nums1.size)
        val m = mutableMapOf<Int, Int>()
        
        for ((i, n) in nums2.withIndex()) {
            m[n] = i
        }
        
        for ((i, n) in nums1.withIndex()) {
            ans[i] = m[n]!!
        }
        
        return ans
    }
}
