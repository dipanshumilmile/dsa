class Solution {
    public int[] dailyTemperatures(int[] temperature) {
        int n = temperature.length;
        int temp[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i < n; i++){
            while(!st.isEmpty() && temperature[i] > temperature[st.peek()]){
                int indx = st.pop();
                temp[indx] = i-indx;
            }
            st.push(i);
        }
        return temp;
    }
}