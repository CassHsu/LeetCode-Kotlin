class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        backtrack(res, mutableListOf(), nums)
        return res
    }

    private fun backtrack(res: MutableList<List<Int>>, tmp: MutableList<Int>, nums: IntArray) {
        if (tmp.size == nums.size) {
            res.add(ArrayList(tmp))
        } else {
            for (i in nums.indices) {
                if (tmp.contains(nums[i])) continue

                tmp.add(nums[i])
                backtrack(res, tmp, nums)
                tmp.removeAt(tmp.size - 1)
            } 
        }
    }
}
