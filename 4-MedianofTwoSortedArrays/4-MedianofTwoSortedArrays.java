// Last updated: 11/29/2025, 12:23:42 PM
1class Solution {
2    public String convert(String s, int numRows) {
3        if(numRows == 1 || numRows>=s.length()){
4            return s;
5        }
6        int index = 0, d=1;
7        List<Character>[] rows = new ArrayList[numRows];
8        for(int i=0; i < numRows; i++){
9            rows[i] = new ArrayList<>();
10        }
11
12        for(char c: s.toCharArray()){
13            rows[index].add(c);
14            if(index == 0){
15                d = 1;
16            } else if(index == numRows - 1){
17                d = -1;
18            }
19            index += d;
20        }
21        StringBuilder result = new StringBuilder();
22        for(List<Character> row : rows){
23            for(char c: row){
24                result.append(c);
25            }
26        }
27        return result.toString();
28    }
29}