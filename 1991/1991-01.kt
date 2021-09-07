class Solution {
    fun findMiddleIndex(nums: IntArray): Int {
        val len = nums.size
        for (i in 0..len-1) {
            if (nums.copyOfRange(0, i).sum() == nums.copyOfRange(i+1, len).sum()) {
                return i
            }
        }
        
        return -1
    }
}
