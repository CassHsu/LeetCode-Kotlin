class Solution {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        var i = 0;
        var j = 0;
        
        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else return nums1[i];
        }

        return -1;
    }
}
