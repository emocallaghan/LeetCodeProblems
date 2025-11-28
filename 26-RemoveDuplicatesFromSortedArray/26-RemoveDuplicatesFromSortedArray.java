// Last updated: 11/27/2025, 9:30:02 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int removedNumbers = 0;
        for(int i=0; i<nums.length-1; i++){
            int index = i-removedNumbers;
            if(nums[index] == nums[i+1]){
                removedNumbers++;
            }
            else{
                nums[index+1] = nums[i+1];
            }

        }
        return nums.length-removedNumbers;
        
    }
}