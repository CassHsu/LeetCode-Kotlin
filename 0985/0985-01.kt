class Solution {
    fun sumEvenAfterQueries(nums: IntArray, queries: Array<IntArray>): IntArray {
        var ans = mutableListOf<Int>()
        var s = 0
        for (n in nums) {
            if (n % 2 == 0) s += n
        }
        
        for (i in 0..queries.size - 1) {
            val j = queries[i][1]
            var k = queries[i][0]
            
            if (nums[j] % 2 == 0) s -= nums[j]
            
            nums[j] += k
            
            if (nums[j] % 2 == 0) s += nums[j]
            
            ans.add(s)
        }
        
        return ans.toIntArray()
    }
}
