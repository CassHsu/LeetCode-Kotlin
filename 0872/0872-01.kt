class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        return dfs(root1) == dfs(root2)
    }
    
    fun dfs(node: TreeNode?): String {
        if (node!!.left == null && node!!.right == null) return node.`val`.toString()
        
        var v: String
        val sb = StringBuilder()
        if (node!!.left != null) {
            v = dfs(node!!.left)
            if (sb.toString() == "") {
                sb.append(v)
            } else {
                sb.append("-").append(v)
            }
        }
        
        if (node!!.right != null) {
            v = dfs(node!!.right)
            if (sb.toString() == "") {
                sb.append(v)
            } else {
                sb.append("-").append(v)
            }
        }
        
        return sb.toString()
    }
}
