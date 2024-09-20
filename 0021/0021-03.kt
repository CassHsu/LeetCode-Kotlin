class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        val head: ListNode

        if (list1.`val` < list2.`val`) {
            head = list1
            list1.next = mergeTwoLists(list1.next, list2)
        } else {
            head = list2
            list2.next = mergeTwoLists(list1, list2.next)
        }

        return head 
    }
}