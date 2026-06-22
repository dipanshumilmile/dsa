class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0;
        int r = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        while(r != nums.length){
            sum += nums[r];
            while(sum >= target){
                int len = r-l+1;
                minLength = Math.min(len, minLength);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;


    }
}