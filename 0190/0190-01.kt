class Solution {
    fun reverseBits(n:Int):Int {
        var ans = 0
        var num = n
        
        for (i in 0 until 32) {
            ans = ans shl 1
            ans = ans or (num and 1)
            num = num shr 1
        }
        
        return ans
    }
}
