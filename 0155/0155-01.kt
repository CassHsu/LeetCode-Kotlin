class MinStack() {

    /** initialize your data structure here. */
    var stack = mutableListOf<Int>()
    var minlist = mutableListOf<Int>()
    var count = 0

    fun push(x: Int) {
        this.stack.add(x)
        if (this.count > 0 && x > this.minlist[this.count - 1]) {
            this.minlist.add(this.minlist[this.count - 1])
        } else {
            this.minlist.add(x)
        }
        this.count++
    }

    fun pop() {
        this.count--
        this.stack.removeAt(this.count)
        this.minlist.removeAt(this.count)
    }

    fun top(): Int {
        return this.stack[this.count - 1]
    }

    fun getMin(): Int {
        return this.minlist[this.count - 1]
    }

}
