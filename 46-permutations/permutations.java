class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void solve(int []nums, boolean []used, List<Integer> list ){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;

            used[i]=true;
            list.add(nums[i]);
            solve(nums, used, list);
            list.remove(list.size()-1);
            used[i]=false;

        }
        
    }
    public List<List<Integer>> permute(int[] nums) {

        solve(nums, new boolean[nums.length], new ArrayList<>());
        return res;
        

        

    }
}