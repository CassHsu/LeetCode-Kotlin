class Solution {
    fun majorityElement(nums: IntArray): Int {
        val size = nums.size / 2
        val m = mutableMapOf<Int, Int>()
        var res = 0
        for (n in nums) {
            m.put(n, m.getOrDefault(n, 0) + 1)
            if (m.getOrDefault(n, 0) > size) {
                res = n
                break
            }
        }
        return res
    }
}