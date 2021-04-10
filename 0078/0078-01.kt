class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        var ret = mutableListOf<MutableList<Int>>()
        ret.add(mutableListOf<Int>())
        
        for (n in nums) {
            val size = ret.size
            for (i in 0..size-1) {
                var ss = mutableListOf<Int>()
                for (r in ret[i]) {
                    ss.add(r)
                }
                ss.add(n)
                ret.add(ss)
            }
        }
        return ret
    }
}
