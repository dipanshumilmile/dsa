class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res="";

        int i=0;
        int n = strs.length;
        while(i <  strs[0].length() &&  i <strs[n-1].length() && strs[0].charAt(i) == strs[n-1].charAt(i)){
           
            res += strs[0].charAt(i);
             i++;
        }
        return res;
    }
}