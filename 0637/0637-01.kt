class Solution {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val ret = ArrayList<Double>()
        val q = ArrayDeque<TreeNode>()
        
        q.add(root)
        
        while (q.isEmpty() == false) {
            val size = q.size
            var sum = 0.0
            
            for (i in 0..size-1) {
                val curr = q.poll()
                sum += curr.`val`.toDouble();
                if (curr.left != null) q.add(curr.left)
                if (curr.right != null) q.add(curr.right)
            }
            
            ret.add(sum / size)
        }
        
        return ret.toDoubleArray()
    }
}
