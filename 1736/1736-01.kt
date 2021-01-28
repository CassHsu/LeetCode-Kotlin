class Solution {
    fun maximumTime(time: String): String {
        var res = time.toCharArray()
        val q = '?'
        if (res[0] == q) {
            if (!(res[1] == q) && res[1].toString().toInt() > 3) res[0] = '1'
            else res[0] = '2'
        }
        if (res[1] == q) {
            if (res[0].toString().toInt() > 1) res[1] = '3'
            else res[1] = '9'
        }
        if (res[3] == q) res[3] = '5'
        if (res[4] == q) res[4] = '9'
        
        return String(res)
    }
}