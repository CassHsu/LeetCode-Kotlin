class Solution {
    fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        var start = list1
        for (i in 1..a-1) {
            start = start!!.next
        }
        
        var end = start
        for (i in a..b) {
            end = end!!.next
        }
        
        start!!.next = list2
        while (start!!.next != null) {
            start = start!!.next
        }
        
        start.next = end!!.next
        return list1
    }
}
