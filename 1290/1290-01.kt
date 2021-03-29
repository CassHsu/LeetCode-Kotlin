class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var curr = head
        var num = curr!!.`val`
        while (curr!!.next != null) {
            num = num.times(2) + curr!!.next!!.`val`
            curr = curr!!.next
        }
        return num
    }
}
