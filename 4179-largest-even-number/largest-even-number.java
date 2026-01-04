class Solution {
    public String largestEven(String s) {
        int lastIndx = -1;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == '2'){
                lastIndx = i;
                break;
            }
        }
        if(lastIndx == -1)  return "";
        return s.substring(0, lastIndx+1);
    }
}