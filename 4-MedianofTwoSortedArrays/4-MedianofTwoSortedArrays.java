// Last updated: 11/27/2025, 11:04:52 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        if(s.length()<=1){
4            return s;
5        }
6        String longest = s.substring(0,1);
7        for(int i=0; i<s.length()-1; i++){
8            String oddPalindrome = getPalindrome(s, i, i);
9            String evenPalindrome = getPalindrome(s, i, i+1);
10            if(oddPalindrome.length()>longest.length()){
11                longest = oddPalindrome;
12            }
13            if(evenPalindrome.length()>longest.length()){
14                longest = evenPalindrome;
15            }
16        }
17        return longest;
18        
19    }
20
21    private String getPalindrome(String s, int left, int right){
22        while(left >= 0 && right<s.length() && s.charAt(left)== s.charAt(right)){
23            left --;
24            right ++;
25        }
26        return s.substring(left+1, right);
27    }
28}