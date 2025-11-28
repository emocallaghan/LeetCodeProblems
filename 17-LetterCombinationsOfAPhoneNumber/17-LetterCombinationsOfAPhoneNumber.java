// Last updated: 11/27/2025, 9:30:04 PM
class Solution {
    Map<String,List<String>> map = Map.of(
        "2", List.of("a", "b", "c"),
        "3", List.of("d", "e", "f"),
        "4", List.of("g", "h", "i"),
        "5", List.of("j", "k", "l"),
        "6", List.of("m", "n", "o"),
        "7", List.of("p", "q", "r", "s"),
        "8", List.of("t", "u", "v"),
        "9", List.of("w", "x", "y", "z")
    );
    List combos = new ArrayList();
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0){
            return combos;
        }
        StringBuilder sb = new StringBuilder();
        solve(0, digits, sb);
        return combos;
    }

    private void solve(int index, String digits, StringBuilder sb){
        if(index>=digits.length()){
            combos.add(sb.toString());
            return;
        }
        List<String> next = map.get(digits.substring(index,index+1));
        for(int i=0; i<next.size(); i++){
            sb.append(next.get(i));
            solve(index+1, digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}