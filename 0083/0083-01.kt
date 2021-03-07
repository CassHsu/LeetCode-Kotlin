class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var ite = head;
        while (ite != null) {
            var tmp = ite.next
            while (tmp != null && tmp.`val` == ite.`val`) {
                tmp = tmp.next
            }
            ite.next = tmp
            ite = ite.next
        }
        return head;
    }
}
