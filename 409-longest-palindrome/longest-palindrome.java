class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int length =0;
        boolean hasOdd=false;

        for(int freq:map.values()){
            if(freq%2==0){
                length+=freq;
            }else{
                length+=freq-1;
                hasOdd=true;
            }
        }
        if(hasOdd){
            length++;
        }
        return length;
    }
}