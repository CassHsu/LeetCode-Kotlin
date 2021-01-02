class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val m = mutableMapOf<Int, Int>()
        val res = mutableListOf<Int>()
        
        for (i in 0..nums.size-1) {
            if (m.getOrDefault(nums[i], -1) >= 0) {
                res.add(m.getOrDefault(nums[i], -1))
                res.add(i)
                break
            }
            m.put(target - nums[i], i)
        }
        return res.toIntArray()
    }
}