// Last updated: 11/27/2025, 9:29:59 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitString = s.split(" ");
        return splitString[splitString.length-1].length();
    }
}