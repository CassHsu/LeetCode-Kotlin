class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        if (stones.size == 1) return stones[0]
        
        val list = stones.toMutableList()
        list.sortDescending()
        
        val m1 = list[0]
        list.remove(m1)
        val m2 = list[0]
        list.remove(m2)
        
        list.add(m1 - m2)
        return lastStoneWeight(list.toIntArray())
    }
}
