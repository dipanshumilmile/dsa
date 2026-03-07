class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st =new Stack<>();
        Stack<Integer> star = new Stack<>();
        int i=0;
        int countStar=0;
        while(i<s.length()){
            if(s.charAt(i)=='(' ){
                st.push(i);
            }
                else if(s.charAt(i)=='*')
                { star.push(i);
            }else{
                if(!st.isEmpty()){
                        st.pop();
                }else{
                    if(!star.isEmpty()) star.pop();
                    else return false;
                }

            }
            i++;
        }
        while(!star.isEmpty()&& !st.isEmpty()){
           if(star.peek() > st.peek()){
            star.pop();
            st.pop();
           }else{
            return false;
           }
        }
        return st.isEmpty();
        }
}