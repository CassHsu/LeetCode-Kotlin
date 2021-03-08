class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var head = ListNode()
        var curr = head
        var ll1 = l1
        var ll2 = l2
        
        while (ll1 != null && ll2 != null) {
            if (ll1.`val` < ll2.`val`) {
                curr.next = ll1
                ll1 = ll1.next
            } else {
                curr.next = ll2
                ll2 = ll2.next
            }
            curr = curr.next
        }
        
        if (ll1 != null) curr.next = ll1;
        if (ll2 != null) curr.next = ll2;
        return head.next
    }
}
