// Last updated: 11/27/2025, 9:30:05 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestSum = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length; i++){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<Math.abs(bestSum-target)){
                    bestSum = sum;
                }
                if(sum == target){
                    return sum;
                }
                else if(sum > target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return bestSum;
    }
}