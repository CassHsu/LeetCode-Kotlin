class Solution {
    fun arraySign(nums: IntArray): Int {
        var p: Double = 1.0
        for (n in nums) {
            p *= n.toDouble()
        }
        return signFunc(p)
    }
    
    fun signFunc(p: Double): Int {
        if (p > 0) return 1;
        else if (p < 0) return -1;
        else return 0;
    }
}
