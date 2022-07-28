class Solution {
    fun flatten(root: TreeNode?): Unit {
        if (root == null) return
        
        var curr = root
        val l = root.left
        val r = root.right
        
        this.flatten(curr.left)
        this.flatten(curr.right)
        
        curr.left = null
        curr.right = l
        
        while (curr!!.right != null) {
            curr = curr.right
        }
        
        curr.right = r
    }
}
