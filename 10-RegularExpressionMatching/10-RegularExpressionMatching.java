// Last updated: 12/2/2025, 8:57:44 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        return match(s, p, 0, 0);
4
5        /*StringBuilder sb = new StringBuilder(s);
6        StringBuilder sbPattern = new StringBuilder(p);
7        int sIndex = 0;
8        for(int i=0; i<sbPattern.length(); i++){
9            if(sbPattern.charAt(i)=='*'){
10                continue;
11            }
12            if(sIndex>=sb.length()){
13                return false;
14            }
15            Boolean nextCharacterStar = false;
16            int numCharToReserve = 0;
17            if(i<sbPattern.length()-1 && sbPattern.charAt(i+1)=='*'){
18                nextCharacterStar = true;
19                while(i+numCharToReserve+2<sbPattern.length() && sbPattern.charAt(i)==sbPattern.charAt(i+2+numCharToReserve)){
20                    numCharToReserve++;
21                }
22            }
23            if(!nextCharacterStar){
24                if(sbPattern.charAt(i)!='.' && sbPattern.charAt(i)!=sb.charAt(sIndex)){
25                    return false;
26                }
27                sIndex++;
28            }
29            else{
30                while(sIndex<sb.length() && (sbPattern.charAt(i)==sb.charAt(sIndex) || sbPattern.charAt(i)=='.')){
31                    sIndex++;
32                }
33                i=i+numCharToReserve+1;
34            }
35        }
36        if(sIndex < sb.length()){
37            return false;
38        }
39        return true;*/
40    }
41    private boolean match (String s, String p, int sIndex, int pIndex){
42        if(sIndex == s.length() && pIndex==p.length()){
43            return true;
44        }
45        if(pIndex == p.length()){
46            return false; 
47        }
48        char curr = p.charAt(pIndex);
49        boolean starNext = (pIndex + 1 < p.length() && p.charAt(pIndex +1) == '*');
50
51        if(starNext){
52            if(match(s, p, sIndex, pIndex + 2)){
53                return true;
54            }
55
56            int i=sIndex;
57            while(i<s.length() && (curr == '.' || s.charAt(i)== curr)){
58                if(match(s, p, i+1, pIndex +2)){
59                    return true;
60                }
61                i++;
62            }
63            return false;
64        }
65        else{
66            if(sIndex < s.length() && (curr == '.' || s.charAt(sIndex) == curr)){
67                return match(s, p, sIndex +1, pIndex +1);
68            }
69            return false;
70        }
71    }
72}