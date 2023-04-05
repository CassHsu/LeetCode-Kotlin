class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var size = nums.size
        var ans = IntArray(size)

        var j = 0
        var k = n
        for (i in 0..size - 1) {
            if (i % 2 == 0) {
                ans[i] = nums[j++]
            } else {
                ans[i] = nums[k++]
            }
        }

        return ans
    }
}
