class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] tokens = path.split("/");

        for(String token : tokens){
            if(token.equals("") || token.equals(".")){
                continue;
            }
            else if( token.equals("..")){
                if(!st.isEmpty()){
                st.pop();
                }
            }else{
                st.push(token);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
           sb.insert(0, "/"+st.pop());
           
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}