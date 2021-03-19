class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null || head!!.next == null) return head
        
        var rlh = reverseList(head!!.next)
        head!!.next!!.next = head
        head.next = null
        return rlh
    }
}
