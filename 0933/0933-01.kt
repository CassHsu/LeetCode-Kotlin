class RecentCounter() {
    var requests: ArrayDeque<Int> = ArrayDeque()
    fun ping(t: Int): Int {
        this.requests.addLast(t)
        val l = t - 3000
        while (this.requests.peekFirst() < l) {
            this.requests.removeFirst()
        }
        return this.requests.size
    }
}