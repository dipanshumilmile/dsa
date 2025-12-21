class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void solve(List<Integer> list, int nums[], boolean []used){
        if(list.size()==nums.length) {
            res.add(new ArrayList<>(list));
        return; 
        }
       for(int i=0; i<nums.length; i++){
        if(used[i]) continue;

        used[i] = true;
        list.add(nums[i]);
        solve(list, nums, used);
        list.remove(list.size()-1);
        used[i]=false;


       }



    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        solve(list, nums, new boolean[nums.length]);
        return res;
        
    }
}