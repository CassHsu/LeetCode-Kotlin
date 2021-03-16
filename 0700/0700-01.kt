class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null
        if (root.`val` == `val`) return root
        
        if (`val` < root.`val`) return searchBST(root.left, `val`)
        return searchBST(root.right, `val`)
    }
}
