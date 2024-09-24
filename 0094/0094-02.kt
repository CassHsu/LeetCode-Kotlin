class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()
        inorderHelper(root, res)
        return res
    }

    private fun inorderHelper(node: TreeNode?, res: MutableList<Int>) {
        if (node != null) {
            inorderHelper(node.left, res)
            res.add(node.`val`)
            inorderHelper(node.right, res)
        }
    }
}
