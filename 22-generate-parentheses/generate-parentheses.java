class Solution {
    List<String> res = new ArrayList<>();
    private boolean isValid(String s){
        int count=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                return false;
            }

        }
        if(count==0) return true;
        return false;
    }
    private void solve(String curr, int n){
         if(curr.length()==2*n){
            if(isValid(curr)){
                res.add(curr);
            }
            return;
         }
         solve(curr + "(", n);
        solve(curr + ")", n);

    }
    public List<String> generateParenthesis(int n) {
       
            String curr="";
             solve(curr, n);
             return res;
        }
    }
