// class Solution {
//     public List<List<Integer>> combine(int n, int k) {
        
//     }
// }
class Solution {
    List<List<Integer>> res= new ArrayList<>();
    private void solve(List<Integer> list, int n, int k, int i){
        if(list.size()==k || i > n){
            if(list.size()==k){
            res.add(new ArrayList<>(list));
            }
            return;
        }
        
            list.add(i);
            solve(list, n, k,i+1);
            list.remove(list.size()-1);
            solve(list, n, k, i+1);
        

    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        solve(list, n, k, 1);
        return res;
    }
}