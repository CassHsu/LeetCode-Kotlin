class Solution {
    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        var values = mutableListOf<Int>()
        var curr = head
        while (curr != null) {
            values.add(curr.`val`)
            curr = curr.next
        }
        
        val il = k - 1
        val ir = values.size - k
        curr = head
        var i = 0
        while (curr != null) {
            if (i == il) curr.`val` = values[ir]
            if (i == ir) curr.`val` = values[il]
            curr = curr.next
            i++
        }
        return head
    }
}
