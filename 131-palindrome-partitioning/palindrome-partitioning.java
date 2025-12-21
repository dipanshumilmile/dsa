class Solution {
    List<List<String>> res = new ArrayList<>();
    private boolean isPalindrome(String s, int indx, int end){
       while (indx < end) {
            if (s.charAt(indx) != s.charAt(end)) {
                return false;
            }
            indx++;
            end--;
        }
        return true;
    }
    private void solve(String s, List<String>list, int indx){
        if(indx==s.length()){
           
            res.add(new ArrayList<>(list));
            
            return;
        }
        for(int i=indx; i<s.length(); i++){
             if(isPalindrome(s, indx, i)){
                list.add(s.substring(indx, i+1));
                solve(s, list, i+1);
                list.remove(list.size()-1);

        }
        }
        
        
    }
    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        solve(s, list, 0);

        return res;
        
    }
}