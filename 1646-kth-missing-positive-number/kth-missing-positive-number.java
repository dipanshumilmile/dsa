class Solution {
    public int findKthPositive(int[] nums, int k) {
        int i=0;
        int n = nums.length;
        int num = 1;
        while(k>0 && i < n){
            if(nums[i] == num){
                i++;
            }else{
                k--;
            
            }
            num++; 
        }
        while(k>0){
            k--;
            num++;
        }
        return num-1;
    }
}