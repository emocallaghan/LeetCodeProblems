// Last updated: 11/27/2025, 9:30:11 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        String unique = s.replaceAll("(.)(?=.*?\\1)", "");
        int longest = unique.length();
        int longestFound = 1;
        while(longestFound<longest){
            for(int i=0; i<s.length()+1-longest;i++){
                String subString = s.substring(i,i+longest).replaceAll("(.)(?=.*?\\1)", "");
                if(subString.length()==longest){
                    return longest;
                }
            }
            longest--;
        }
        return longest;
    }
}