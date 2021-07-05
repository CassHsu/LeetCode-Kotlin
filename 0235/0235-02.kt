class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        val pv = p!!.`val`
        val qv = q!!.`val`
        var node = root
        
        while (node != null) {
            if (pv > node!!.`val` && qv > node!!.`val`) {
                node = node.right
            } else if (pv < node!!.`val` && qv < node!!.`val`) {
                node = node.left
            } else {
                return node
            }
        }
        return null
    }
}
