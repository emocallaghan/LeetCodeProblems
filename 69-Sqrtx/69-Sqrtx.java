// Last updated: 11/27/2025, 9:29:56 PM
class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int lowerBound = 1;
        int upperBound = x;
        int mid = 0;
        while(lowerBound <= upperBound){
            mid = lowerBound + (upperBound-lowerBound)/2;
            if((long)mid*mid>x){
                upperBound = mid-1;
            }
            else if((long) mid*mid == x){
                return mid;
            }
            else{
                lowerBound = mid+1;
            }
        }
        return upperBound;
    }
}