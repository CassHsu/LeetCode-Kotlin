class Solution {
    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        var curr = head;
        var n1: ListNode? = null
        var n2: ListNode? = null
        
        var count = k
        while (curr != null) {
            count--
            if (n2 != null) n2 = n2.next
            if (count == 0) {
                n1 = curr
                n2 = head
            }
            curr = curr.next
        }
        
        val tmp = n1!!.`val`
        n1.`val` = n2!!.`val`
        n2.`val` = tmp
        
        return head
    }
}
