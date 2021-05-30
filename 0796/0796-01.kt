class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        if (s == "" && goal == "") return true
        if (s.length != goal.length) return false
        if (s == goal) return true
        
        var lg = goal.toMutableList();
        for (i in 0..goal.length - 1) {
            Collections.rotate(lg, 1)
            if (s == lg.joinToString("")) return true;
        }
        return false
    }
}
