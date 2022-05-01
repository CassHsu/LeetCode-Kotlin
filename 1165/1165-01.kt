class Solution {
    fun calculateTime(keyboard: String, word: String): Int {
        val m = mutableMapOf<Char, Int>()
        
        for ((i, k) in keyboard.withIndex()) {
            m.put(k, i)
        }
        
        var count = 0
        var curr = 0
        for (w in word) {
            count += Math.abs(m.get(w)!!.minus(curr))
            curr = m.get(w)!!
        }
        
        return count
    }
}
