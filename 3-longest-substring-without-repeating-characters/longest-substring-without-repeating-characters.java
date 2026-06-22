class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int l = 0;
        int r = 0;
        int longest = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        while(r != s.length()){
            char ch = s.charAt(r);
            while(map.containsKey(ch)){
                char c = s.charAt(l);
                map.put(c, map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
                l++;
            }
            map.put(ch, map.getOrDefault(ch,0)+1);
            longest=Math.max(r-l+1, longest);
            r++;
        
        }
        return longest;
    }
}