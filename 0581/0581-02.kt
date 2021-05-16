class Solution {
    fun findUnsortedSubarray(nums: IntArray): Int {
        var r = 0
        var l = nums.size
        var snums = nums.clone()
        Arrays.sort(snums)
        
        for (i in 0..nums.size-1) {
            if (nums[i] != snums[i]) {
                r = Math.max(r, i)
                l = Math.min(l, i)
            }
        }
        
        if (r - l > 0) return r - l + 1
        else return 0
    }
}
