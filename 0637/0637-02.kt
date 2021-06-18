class Solution {
    val sums = mutableListOf<Double>()
    val counts = mutableListOf<Int>()
    
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        this.dfs(root, 0)
        
        for (i in 0..this.sums.size - 1) {
            this.sums[i] = this.sums[i] / this.counts[i];
        }
        
        return this.sums.toDoubleArray()
    }
    
    fun dfs(n: TreeNode?, i: Int) {
        if (n == null) return;
        
        if (i < this.sums.size) {
            this.sums.set(i, this.sums[i] + n.`val`)
            this.counts[i]++
            
        } else {
            this.sums.add(1.0 * n.`val`)
            this.counts.add(1)
        }
        
        this.dfs(n.left, i+1);
        this.dfs(n.right, i+1);
    }
}
