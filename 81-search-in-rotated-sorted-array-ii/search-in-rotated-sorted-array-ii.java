class Solution {
    private int findPivot(int []nums, int l, int r){
        while(l<r){
            
            while(l<r && nums[l]==nums[l+1]) l++;
            while(l<r && nums[r]==nums[r-1]) r--;
            int mid = l + (r-l)/2;
            if(nums[mid]>nums[r]) l=mid+1;
            
            else r=mid;
        }
        return r;
    }
    private boolean binaryS(int []nums, int l, int r, int target){
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]==target)  return true;
             if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;

            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length-1);
        boolean result = binaryS(nums, pivot, nums.length-1, target);
        if(result) return true;
        return binaryS(nums, 0, pivot-1, target);
        
    }
}