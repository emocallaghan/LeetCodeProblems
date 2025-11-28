// Last updated: 11/27/2025, 9:29:54 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1=1;
        int index2=1;
        for(int i=nums1.length-1; i>=0; i--){
            if(index1<=m && index2<=n){
                if(nums1[m-index1]>nums2[n-index2]){
                    nums1[i] = nums1[m-index1];
                    index1++;
                }
                else{
                    nums1[i] = nums2[n-index2];
                    index2++;
                }
            }
            else{
                nums1[i] = index1<=m ? nums1[m-index1++] : nums2[n-index2++];
            }
        }
    }
}