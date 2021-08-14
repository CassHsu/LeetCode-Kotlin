class Solution {
    val ans: MutableList<ArrayList<Int>> = arrayListOf()
    
    fun permute(nums: IntArray): List<List<Int>> {
        backtrack(nums, arrayListOf())
        return this.ans
    }
    
    fun backtrack(nums: IntArray, curr: ArrayList<Int>) {
        if (curr.size == nums.size) {
            this.ans.add(ArrayList(curr))
            return
        }
        
        for (n in nums) {
            if (curr.contains(n)) continue
            
            curr.add(n)
            backtrack(nums, curr)
            curr.removeAt(curr.lastIndex)
        }
    }
}
