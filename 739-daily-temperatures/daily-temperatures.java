class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
      
        int n = temperatures.length;
          int temp[] = new int[n];
        for(int i=n-1; i>=0; i--){
            if(st.isEmpty()){ temp[i] = 0;
            st.push(i);

        }else{
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()] ){
               st.pop();
            }if(st.isEmpty()){
                temp[i] = 0;
                
            }else{
                temp[i] = st.peek()-i;
            }
            st.push(i);
        }
        }
        return temp;
    }
}