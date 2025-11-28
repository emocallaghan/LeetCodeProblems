// Last updated: 11/27/2025, 9:30:08 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int shortestLen = -1;
        for(int i=0; i<strs.length; i++){
            if(strs[i].length()<shortestLen || shortestLen == -1){
                shortestLen = strs[i].length();
            }
        }
        String prefix = "";
        for (int i=1; i<shortestLen+1; i++){
            String subString = strs[0].substring(0,i);
            String temp = prefix;
            for(int j=1; j<strs.length; j++){
                if(strs[j].substring(0,i).equals(subString)){
                    temp = subString;
                }
                else{
                    return prefix;
                }
            }
            prefix = temp;
        }
        return prefix;
    }
}