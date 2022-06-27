class Solution {
    fun checkPossibility(nums: IntArray): Boolean {
        var changed = false
        val n = mutableListOf<Int>()
        n.add(nums[0])
        
        for (i in 1..nums.size - 1) {
            n.add(nums[i])
            if (n[i] >= n[i - 1]) continue
            if (changed) return false
            
            if (i == 1 || n[i] >= n[i - 2]) n[i - 1] = n[i]
            else n[i] = n[i - 1]
            changed = true
        }
        
        return true
    }
}
