// Last updated: 11/29/2025, 1:50:49 PM
1class Solution {
2    public int myAtoi(String s) {
3        if(s==null){
4            return 0;
5        }
6        s = s.trim();
7        if(s.equals("") || s.equals("-") || s.equals("+")){
8            return 0;
9        }
10        StringBuilder sb = new StringBuilder(s);
11        int negativeModifier = 1;
12        int converted = 0;
13        int numDigits = 0;
14        if(sb.charAt(0) == '-' || sb.charAt(0)== '+'){
15            negativeModifier = sb.charAt(0) == '-' ? -1 : 1;
16            sb.deleteCharAt(0);
17        }
18        for(int i=0; i < sb.length(); i++){
19            int nextDigit = sb.charAt(i) - '0';
20            if(nextDigit>=0 && nextDigit<=9){
21                if(numDigits<9){
22                    converted = converted*10 + nextDigit;
23                    if(converted > 0){
24                        numDigits++;
25                    }
26                }
27                else if(converted >= Integer.MAX_VALUE/10){
28                    if(converted > Integer.MAX_VALUE/10 || 
29                    (converted == Integer.MAX_VALUE/10 && nextDigit > Integer.MAX_VALUE%10)){
30                        return negativeModifier == 1 ? Integer.MAX_VALUE : negativeModifier*Integer.MAX_VALUE-1;
31                    }
32                    converted = converted*10 + nextDigit;
33                    numDigits++;
34                }
35                else{
36                    converted = converted*10 + nextDigit;
37                    numDigits++; 
38                }
39            }
40            else{
41                break;
42            }
43        }
44        return negativeModifier * converted;
45    }
46}