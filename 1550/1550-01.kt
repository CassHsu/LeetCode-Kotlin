class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var count = 0
        
        for (a in arr) {
            if (a % 2 != 0) {
                count++
                if (count == 3) return true
                
            } else {
                count = 0
            }
        }
        
        return false
    }
}
