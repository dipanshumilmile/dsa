class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i=nums.length-1;
        while(i>=0 && set.add(nums[i])){
            i--;
        }
        return i<0? 0: (i+3)/3;
    }
}