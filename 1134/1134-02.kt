class Solution {
    fun isArmstrong(n: Int): Boolean {
        var total = 0.0
        val sn = n.toString()
        val size = sn.length.toDouble()
        
        sn.forEach({ it -> total += Math.pow(it.toString().toDouble(), size)})
        
        return total == n.toDouble()
    }
}
