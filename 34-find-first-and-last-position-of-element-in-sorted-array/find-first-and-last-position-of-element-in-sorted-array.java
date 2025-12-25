class Solution {
    private int leftmost(int []nums, int target, int n){
        int l=0; int r=n-1;
        int leftmost=-1;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]==target){
                leftmost=mid;
                r=mid-1;

            }
            else if(nums[mid]<target){
                l=mid+1;
            }else r=mid-1;
        }
        return leftmost;
    }
     private int rightmost(int []nums, int target, int n){
        int l=0; int r=n-1;
        int rightmost=-1;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]==target){
                rightmost=mid;
                l=mid+1;

            }
            else if(nums[mid]<target){
                l=mid+1;
            }else r=mid-1;
        }
        return rightmost;
    }
    public int[] searchRange(int[] nums, int target) {
        
        int left = leftmost(nums, target, nums.length);
        int right = rightmost(nums, target, nums.length);

        return new int[]{left, right};
        
    }
}