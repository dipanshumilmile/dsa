class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int i=0;
        while( i < s.length()){
            if(!st.isEmpty()&& st.peek() == s.charAt(i) ) 
                {st.pop();
            }else{
              
                st.push(s.charAt(i));
            }
              i++;
            
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        }
    }
