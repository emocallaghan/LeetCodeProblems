// Last updated: 11/27/2025, 9:29:57 PM
class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;
        String sum = "";
        while(aIndex>=0 || bIndex >= 0 || carry>0){
            if(aIndex>=0){
                carry = carry + (a.charAt(aIndex) - '0');
            }
            if(bIndex >= 0){
                carry = carry + (b.charAt(bIndex) - '0');
            }
            sum = Integer.toString(carry % 2) + sum;
            carry = carry/2;
            aIndex--;
            bIndex--;
        }
        return sum;
    }
}