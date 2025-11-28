// Last updated: 11/27/2025, 9:30:10 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sorted = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length){
            sorted[k++] = nums1[i] < nums2 [j] ? nums1[i++] : nums2[j++];
        }
        while (i < nums1.length){ 
            sorted[k++] = nums1[i++];
        }
        while (j < nums2.length){    
            sorted[k++] = nums2[j++];
        }
        if(sorted.length % 2 == 1){
            return sorted[sorted.length/2];
        }
        else{
            return (sorted[sorted.length/2]+sorted[sorted.length/2-1])/2.0;
        }
    }
}