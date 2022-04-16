class Solution {
    var low: Int = 0
    var high: Int = 0
    
    fun trimBST(root: TreeNode?, low: Int, high: Int): TreeNode? {
        this.low = low
        this.high = high
        return trim(root)
    }
    
    fun trim(node: TreeNode?): TreeNode? {
        if (node == null) return null
        else if (node.`val` > this.high) {
            return trim(node.left)
        } else if (node.`val` < this.low) {
            return trim(node.right)
        } else {
            node.left = trim(node.left)
            node.right = trim(node.right)
            return node
        }
    }
}
