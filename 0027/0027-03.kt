class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var newLength = 0

        for (num in nums) {
            if (num != `val`) {
                nums[newLength++] = num
            }
        }
        
        return newLength
    }
}
