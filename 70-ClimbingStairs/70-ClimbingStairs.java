// Last updated: 11/27/2025, 9:29:54 PM
class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n==2 || n==3){
            return n;
        }
        int prev =1 , curr = 1;
        for(int i=2; i<=n; i++){
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;    }
}