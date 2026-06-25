class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int []nextG = new int[n];
        for(int i = 2*n-1; i>=0; i--){
            int indx = i % n;

            while(!st.isEmpty() && nums[indx] >= nums[st.peek()]){
                st.pop();
            }
            if(!st.empty()){
                nextG[indx]=nums[st.peek()];
            }else{
               nextG[indx] = -1;
            }
            st.push(indx);

        }
        return nextG;
    }
}