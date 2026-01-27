class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int count=0;
        int len =0;
        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            while(map.containsKey(ch)){
                char c = s.charAt(left);
                map.put(c, map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);

                }
                left++;
                

            }
            map.put(ch, map.getOrDefault(ch,0)+1);
            
            len = Math.max(len, right-left+1);


        }
        return len;
    }
}