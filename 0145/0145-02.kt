class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val ans = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        
        if (root != null)
            stack.push(root)
        
        while (stack.isEmpty() == false) {
            val node = stack.pop()
            
            if (node.left != null) stack.push(node.left)
            if (node.right != null) stack.push(node.right)
            
            ans.add(node.`val`)
        } 
        
        return ans.reversed();
    }
}
