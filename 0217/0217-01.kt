class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val m = mutableMapOf<Int,Boolean>()
        for (n in nums) {
            m[n]?.let {return true}
            m[n] = true
        }
        return false
    }
}