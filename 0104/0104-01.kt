class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return dfs(root, 0)
    }
    
    fun dfs(root: TreeNode?, count: Int): Int {
        if (root == null) return count
        
        var cnt = count + 1
        val l = dfs(root.left, cnt)
        val r = dfs(root.right, cnt)
        
        return Math.max(l, r)
    }
}