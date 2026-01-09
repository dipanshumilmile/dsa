class Solution {
    List<String> res = new ArrayList<>();
    private void solve(String s, StringBuilder ans, int i){
         if(i==s.length()){
            res.add(ans.toString());
            return;
         }
           char ch = s.charAt(i);
         ans.append(Character.toLowerCase(ch));
         solve(s, ans, i+1);
         
         ans.deleteCharAt(ans.length() - 1);
         if (Character.isLetter(ch)) {
         
         
        ans.append(Character.toUpperCase(ch));
        solve(s, ans, i+1);
        ans.deleteCharAt(ans.length() - 1);
         }


    }
    public List<String> letterCasePermutation(String s) {
        solve( s, new StringBuilder(), 0);
        return res;
    }
}