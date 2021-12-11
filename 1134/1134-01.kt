class Solution {
    fun isArmstrong(n: Int): Boolean {
        var total = 0.0
        val sn = n.toString()
        val size = sn.length.toDouble()
        
        for (c in sn) {
            total += Math.pow(c.toString().toDouble(), size)
        }
        
        return total == n.toDouble()
    }
}
