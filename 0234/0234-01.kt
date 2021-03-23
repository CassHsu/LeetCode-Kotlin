class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var fast = head;
        var slow = head;
        var stack: Stack<Int> = Stack<Int>()
        
        while (fast != null && fast.next != null) {
            stack.push(slow!!.`val`)
            fast = fast.next.next
            slow = slow!!.next
        }
        
        if (fast != null) slow = slow!!.next
        
        while (slow != null) {
            if (slow.`val` != stack.pop()) return false
            slow = slow.next
        }
        return true
    }
}
