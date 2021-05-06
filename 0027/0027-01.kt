class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        for (j in 0..nums.lastIndex) {
            if (nums[j] != `val`) {
                nums[i] = nums[j]
                i++
            }
        }        
        return i
    }
}
