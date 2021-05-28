class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max1 = 0;
        var count = 0;
        
        for (n in nums) {
            if (n == 1) count++
            else count = 0
            
            if (count > max1) max1 = count
        }
        return max1;
    }
}
