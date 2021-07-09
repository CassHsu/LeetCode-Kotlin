class Solution {
    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
        val sa = aliceSizes.sum()
        val sb = bobSizes.sum()
        val ret = IntArray(2) {0}
        
        val t = (sb - sa) shr 1
        for (i in 0..bobSizes.size - 1) {
            if ((bobSizes[i] - t) in aliceSizes) {
                ret[0] = bobSizes[i] - t
                ret[1] = bobSizes[i]
                return ret
            }
        }
        
        return ret 
    }
}
