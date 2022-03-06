class Solution {
    fun minimumSum(num: Int): Int {
        val nums: MutableList<Int> = mutableListOf()
        var n = num
        for (i in 0..3) {
            nums.add(n % 10)
            n = n / 10
        }
        
        nums.sort()
        
        val n1 = nums[0] * 10 + nums[2]
        val n2 = nums[1] * 10 + nums[3]
        return n1 + n2
    }
}
