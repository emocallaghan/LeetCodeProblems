// Last updated: 11/29/2025, 12:49:25 PM
1class Solution {
2    public int reverse(int x) {
3        if(x == 0){
4            return x;
5        }
6        int negativeModifier = x<0 ? -1 : 1;
7        x = x*negativeModifier;
8        //remove any trailing zeros from end;
9        while(x%10 == 0){
10            x=x/10;
11        }
12        if(countDigits(x) == 10){
13            StringBuilder reversedStr = new StringBuilder(Integer.toString(x)).reverse();
14            StringBuilder maxInt = new StringBuilder(Integer.toString(Integer.MAX_VALUE));
15            for(int i=0; i< reversedStr.length(); i++){
16                int reversedDigit = reversedStr.charAt(i) - 0;
17                int maxIntDigit = maxInt.charAt(i) - 0;
18                if(reversedDigit < maxIntDigit){
19                    break;
20                } else if(reversedDigit > maxIntDigit){
21                    return 0;
22                }
23            }
24        }
25
26        int flipped = 0;
27        while(x>0){
28            flipped = flipped * 10 + x%10;
29            x = x/10;
30        }
31        return negativeModifier * flipped;
32    }
33
34    private int countDigits(int x){
35        int digits = 0;
36        while(x>0){
37            x = x/10;
38            digits++;
39        }
40        return digits;
41    }
42}