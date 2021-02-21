class LRUCache(val capacity: Int) {
    private class Node(val key: Int, var value: Int) {
        constructor(): this(0, 0)
        companion object {
            val node = Node()
        }
        var prev = node
        var next = node
    }
    
    private val head = Node()
    private val map = mutableMapOf<Int, Node>()
    
    init {
        head.next = head
        head.prev = head
    }
    
    private fun remove(node: Node) {
        node.prev.next = node.next
        node.next.prev = node.prev
    }
    
    private fun add(node: Node) {
        node.prev = head.prev
        node.next = head
        head.prev.next = node
        head.prev = node
    }
    
    fun get(key: Int): Int {
        return map[key]?.let {
            remove(it)
            add(it)
            it.value
        } ?: -1
    }

    fun put(key: Int, value: Int) {
        map[key]?.let {
            remove(it)
            add(it)
            it.value = value
            return
        }
        
        if (map.size == capacity) {
            val node = head.next
            remove(node)
            map.remove(node.key)
        }
        
        val node = Node(key, value)
        add(node)
        map[key] = node
    }
}
