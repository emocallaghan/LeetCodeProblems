// Last updated: 11/27/2025, 9:29:58 PM
class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1] = digits[digits.length-1]+1;
            return digits;
        }
        Boolean leadingNumer = digits[0] ==9 ? true : false;
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i] = digits[i]+1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        for(int i=1; i<newDigits.length; i++){
            newDigits[i] = digits[i-1];
        } 
        return newDigits;
    }
}