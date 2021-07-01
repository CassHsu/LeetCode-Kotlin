class Solution {
    val ret = mutableListOf<Int>()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        preorder(root)
        return ret
    }
    
    fun preorder(node: TreeNode?) {
        if (node == null) return
        
        ret.add(node.`val`)
        preorder(node.left)
        preorder(node.right)
    }
}
