class MyHashMap() {
    val buckets: IntArray = IntArray(1000001) { -1 }
    fun put(key: Int, value: Int) {
        this.buckets[key] = value
    }

    fun get(key: Int): Int {
        return this.buckets[key];
    }

    fun remove(key: Int) {
        this.buckets[key] = -1
    }
}
