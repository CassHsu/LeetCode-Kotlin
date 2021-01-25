class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
          var res = mutableListOf<Int>()
          var m = mutableMapOf<Int, Int>()
          
          for (n in nums1) {
              if (m.contains(n)) {
                  m[n] = m.getOrDefault(n, 1) + 1
              } else {
                  m[n] = 1
              }
          }
          
          for (n in nums2) {
              if (m.contains(n) && m.getOrDefault(n, 1) > 0) {
                  m[n] = m.getOrDefault(n, 1) - 1
                  res.add(n)
              }
          }
          return res.toIntArray()
    }
}