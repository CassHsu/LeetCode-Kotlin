class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val m = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val find = target - nums[i]
            
            if (m.contains(find)) {
                return intArrayOf(m[find]!!, i)
            }

            m[nums[i]] = i
        }

        return intArrayOf(-1, -1)
    }
}
