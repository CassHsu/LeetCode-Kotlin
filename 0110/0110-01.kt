class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        return checkHeight(root) != -1
    }

    private fun checkHeight(node: TreeNode?): Int {
        if (node == null) return 0

        val leftHeight = checkHeight(node.left)
        if (leftHeight == -1) return -1

        val rightHeight = checkHeight(node.right)
        if (rightHeight == -1) return -1

        return if (Math.abs(leftHeight - rightHeight) > 1) -1 else Math.max(leftHeight, rightHeight) + 1
    }
}
