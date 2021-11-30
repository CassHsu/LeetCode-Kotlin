class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        val ans = mutableListOf<Int>()
        nums.sort()
        
        for ((i, n) in nums.withIndex()) {
            if (n == target) {
                ans.add(i)
            }
        }
        
        return ans
    }
}
