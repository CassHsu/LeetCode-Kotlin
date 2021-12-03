class Solution {
    val ans = mutableListOf<Int>()
    fun getLonelyNodes(root: TreeNode?): List<Int> {
        dfs(root)
        return ans
    }
    
    fun dfs(node: TreeNode?) {
        if (node == null) return
        if (node.left == null && node.right != null) ans.add(node.right.`val`)
        if (node.left != null && node.right == null) ans.add(node.left.`val`)
        
        dfs(node.left)
        dfs(node.right)
    }
}
