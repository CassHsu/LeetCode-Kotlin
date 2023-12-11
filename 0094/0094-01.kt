class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var ans = mutableListOf<Int>()
        root?.dfs(ans)
        return ans
    }

    private fun TreeNode.dfs(nodes: MutableList<Int>) {
        left?.dfs(nodes)
        nodes += `val`
        right?.dfs(nodes)
    }
}
