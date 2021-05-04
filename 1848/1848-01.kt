import kotlin.math.*

class Solution {
    fun getMinDistance(nums: IntArray, target: Int, start: Int): Int {
        var ans = 100000
        nums.forEachIndexed{i, it -> 
            if (it == target) {
                 ans = min(ans, abs(i - start))
            }
        }
        return ans
    }
}
