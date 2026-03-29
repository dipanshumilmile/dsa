class Solution {
    List<String> res = new ArrayList<>();

    private void solve(String curr, int n, int open, int close){
        if(curr.length() == 2*n){
            res.add(curr);
            return;
        }

        if(open < n){
            
            solve(curr+"(", n, open+1, close);
        }
         if(close < open){
            
            solve(curr+")", n, open, close+1);
        }
    }
    public List<String> generateParenthesis(int n) {

        solve("",n,0, 0);
        return res;
        
    }
}