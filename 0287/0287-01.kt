class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var fast = 0
        while (true) {
            fast = nums[fast]
            fast = nums[fast]
            slow = nums[slow]
            
            if (slow == fast) {
                slow = 0
                break
            }
        }
        
        while (true) {
            fast = nums[fast]
            slow = nums[slow]
            
            if (slow == fast) return slow
        }
        return -1
    }
}
