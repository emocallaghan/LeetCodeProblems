// Last updated: 11/27/2025, 9:30:09 PM
class Solution {
    Map<Character, Integer> numeralMap = Map.of(
    'I', 1,
    'V', 5,
    'X', 10,
    'L', 50,
    'C', 100,
    'D', 500,
    'M', 1000
    );
    public int romanToInt(String s) {
        int num = 0;
        for(int i=0; i<s.length()-1; i++){
            if(numeralMap.get(s.charAt(i))<numeralMap.get(s.charAt(i+1))){
                num -= numeralMap.get(s.charAt(i));
            }
            else{
                num += numeralMap.get(s.charAt(i));
            }
        }
        return num += numeralMap.get(s.charAt(s.length()-1));
    }
}