class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null || head!!.next == null) return head
        
        var curr = head
        var prev: ListNode? = null
        var next: ListNode? = null
        while (curr != null) {
            next = curr!!.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}
