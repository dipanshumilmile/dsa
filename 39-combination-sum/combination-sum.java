class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public void sol(List<Integer> list, int[]nums, int target, int i){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || i==nums.length){
            return;
        }
        list.add(nums[i]);
        sol(list, nums, target-nums[i], i);
        list.remove(list.size()-1);
        sol(list, nums, target, i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        sol(list, candidates, target, 0);
        return res;
    }
}