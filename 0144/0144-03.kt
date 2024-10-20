class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        traverse(root, result)
        return result
    }

    private fun traverse(node: TreeNode?, result: MutableList<Int>) {
        if (node != null) {
            result.add(node.`val`)
            traverse(node.left, result)
            traverse(node.right, result)
        }
    }
}
