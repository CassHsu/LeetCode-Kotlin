class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var curr = head
        var num = curr!!.`val`
        while (curr!!.next != null) {
            num = (num shl 1) or (curr!!.next!!.`val`)
            curr = curr!!.next
        }
        return num
    }
}
