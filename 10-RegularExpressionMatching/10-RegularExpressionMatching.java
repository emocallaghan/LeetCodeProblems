// Last updated: 12/2/2025, 11:12:09 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int maxVolume = -1;
4        int right = height.length-1;
5        int left = 0;
6        while(right>left){
7            int minHeight = height[left] < height[right] ? height [left] : height[right];
8            if(right <= left){
9                return maxVolume;
10            }
11            if((right-left)*(minHeight)>maxVolume){
12                maxVolume = (right-left)* minHeight;
13            }
14            if(height[left] < height[right]){
15                left++;
16            }
17            else{
18                right--;
19            }
20        }
21        return maxVolume;
22    }
23}