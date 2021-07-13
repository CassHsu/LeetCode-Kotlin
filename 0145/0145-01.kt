class Solution {
    val ret = mutableListOf<Int>()
    fun postorderTraversal(root: TreeNode?): List<Int> {
        postorder(root)
        return ret
    }
    
    fun postorder(node: TreeNode?) {
        if (node == null) return
        
        postorder(node.left)
        postorder(node.right)
        ret.add(node.`val`)
    }
}
