class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        if (headA == null || headB == null) return null
        
        var a = headA
        var b = headB
        while (a != b) {
						a = if (a != null) a.next else headB
            b = if (b != null) b.next else headA
        }
        return a
    }
}
