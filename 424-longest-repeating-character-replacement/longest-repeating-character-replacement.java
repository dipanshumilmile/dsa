class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxLen=0;
        int left=0;
        
        int maxFreq=0;
        int ans=0;

        for(int right=0; right<s.length(); right++){
            int c = s.charAt(right);
            freq[c-'A']++;
            maxFreq = Math.max(freq[c-'A'], maxFreq);
            int windowSize = right - left + 1;
            if(windowSize - maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            
            ans= Math.max(ans, right-left+1);


        }
        return ans;
        
    }
}