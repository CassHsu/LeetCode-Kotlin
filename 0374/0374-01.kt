class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var low = 1
        var high = n
        
        while (low <= high) {
            var mid = low + (high - low) / 2
            var res = guess(mid)
            if (res == 0) {
                return mid
            } else if (res > 0) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        
        return -1;
    }
}
