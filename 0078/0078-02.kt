class Solution {
    val ret: MutableList<ArrayList<Int>> = arrayListOf()
    
    fun subsets(nums: IntArray): List<List<Int>> {        
        backtrack(nums, arrayListOf(), 0)
        return this.ret
    }
    
    fun backtrack(nums: IntArray, curr: ArrayList<Int>, i: Int) {
        if (i >= nums.size) {
            this.ret.add(ArrayList(curr))
            return
        }
        
        curr.add(nums[i])
        backtrack(nums, curr, i + 1)
        
        curr.removeAt(curr.lastIndex)
        backtrack(nums, curr, i + 1)
    }
}
