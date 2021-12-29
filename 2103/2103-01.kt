class Solution {
    fun countPoints(rings: String): Int {
        var count = 0
        val m = mutableMapOf<Char, String>()
        
        var i = 0
        var j = 1
        while (j < rings.length) {
            var v = m.getOrDefault(rings[j], "")
            m.set(rings[j], v + rings[i])
            
            i += 2
            j += 2
        }
        
        for ((_, v) in m) {
            if (v.length < 3) continue
            
            var r = false
            var g = false
            var b = false

            for (c in v) {
                if (c == 'R') r = true
                if (c == 'G') g = true
                if (c == 'B') b = true

                if (r && g && b) {
                    count++
                    break
                }
            }
        }
        
        return count
    }
}
