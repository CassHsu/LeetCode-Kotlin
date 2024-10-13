class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val effectiveK = k % n
        reverse(nums, 0, n - 1)
        reverse(nums, 0, effectiveK - 1)
        reverse(nums, effectiveK, n - 1)
    }

    private fun reverse(nums: IntArray, start: Int, end: Int) {
        var s = start
        var e = end
        
        while (s < e) {
            val temp = nums[s]
            nums[s] = nums[e]
            nums[e] = temp
            s++
            e--
        }
    }
}
