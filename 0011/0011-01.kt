class Solution {
    fun maxArea(height: IntArray): Int {
        var ans = 0
        var l = 0
        var r = height.size - 1
        
        while (l < r) {
            val area = (r - l) * Math.min(height[l], height[r])
            ans = Math.max(ans, area)
            
            if (height[l] < height[r]) l++
            else r--
        }
        
        return ans
    }
}
