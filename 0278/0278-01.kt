class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var start = 1
        var end = n
        
        while (true) {
            val mid = start + (end - start) / 2
            if (isBadVersion(mid) && !isBadVersion(mid-1)) return mid
            if (isBadVersion(mid) == false) {
                start = mid + 1
            } else {
                end = mid
            }
        }
	}
}
