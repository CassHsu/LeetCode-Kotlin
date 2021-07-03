class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val ans = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        
        if (root != null)
            stack.push(root)
        
        while (stack.isEmpty() == false) {
            val node = stack.pop()
            ans.add(node.`val`)
            
            if (node.right != null) stack.push(node.right)
            if (node.left != null) stack.push(node.left)
        } 
        
        return ans;
    }
}
