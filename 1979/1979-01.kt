class Solution {
    fun findGCD(nums: IntArray): Int {
        var small = nums[0]
        var large = nums[0]
        
        for (n in nums) {
            if (n < small) small = n
            else if (n > large) large = n
        }
        
        return gcd(large, small)
    }
    
    fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    }
}
