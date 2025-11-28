// Last updated: 11/27/2025, 9:30:00 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int k = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target || nums[k]==target){
                return nums[i]==target ? i : k;
            }
            if(nums[i]>target || nums[k]<target){
                return nums[i]>target ? i : k+1;
            }
            if(nums[k]>target){
                k--;
            }
        }
        return k;
    }
}