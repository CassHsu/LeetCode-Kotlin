class Solution {
    fun findUnsortedSubarray(nums: IntArray): Int {
        var r = 0
        var l = nums.size
        
        for (i in 0..nums.size - 2) {
            for (j in i+1..nums.size - 1) {
                if (nums[j] < nums[i]) {
                    r = Math.max(r, j)
                    l = Math.min(l, i)
                }
            }
        }
        
        if (r - l > 0) return r - l + 1
        else return 0
    }
}
