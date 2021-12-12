class Solution {
    fun largestUniqueNumber(nums: IntArray): Int {
        val m = mutableMapOf<Int, Int>()
        val singles = mutableListOf<Int>()
        
        for (n in nums) {
            if (m.containsKey(n)) m.set(n, m.get(n)!!.plus(1))
            else m.set(n, 1)
        }
        
        m.forEach { (k, v) -> if (v == 1) singles.add(k) }
        
        if (singles.size <= 0) return -1
        return singles.max()!!
    }
}
