class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        val pv = p!!.`val`
        val qv = q!!.`val`
        val rv = root!!.`val`
        
        if (pv > rv && qv > rv) {
            return lowestCommonAncestor(root.right, p, q)
            
        } else if (pv < rv && qv < rv) {
            return lowestCommonAncestor(root.left, p, q)
            
        } else {
            return root
        }
        
    }
}
