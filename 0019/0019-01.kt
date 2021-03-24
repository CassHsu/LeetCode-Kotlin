class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var dummy: ListNode? = ListNode(-1)
        dummy!!.next = head
        var fast = dummy
        var slow = dummy
        
        for (i in 0..n-1) {
            fast = fast!!.next
        }
        
        while (fast!!.next != null) {
            fast = fast.next
            slow = slow!!.next
        }
        
        slow!!.next = slow!!.next!!.next
        return dummy.next
    }
}
