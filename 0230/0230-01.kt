class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val leftSize = getSize(root!!.left)
        if (k <= leftSize) return kthSmallest(root.left, k)
        if (k == leftSize + 1) return root.`val`
        return kthSmallest(root.right, k - (leftSize + 1))
    }
    
    fun getSize(root: TreeNode?): Int {
        if (root == null) return 0
        return getSize(root.left) + 1 + getSize(root.right)
    }
}