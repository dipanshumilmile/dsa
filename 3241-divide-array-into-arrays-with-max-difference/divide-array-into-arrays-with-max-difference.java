class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int j=0;
        int[][] result = new int[n / 3][3];
        for(int i=0; i<n ;i+=3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
            result[j][0]=nums[i];
            result[j][1]=nums[i+1];
            result[j][2]=nums[i+2];
            j++;
        }
        return result;
    }
}