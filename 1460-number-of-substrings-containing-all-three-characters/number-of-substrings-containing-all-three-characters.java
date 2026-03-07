class Solution {
    public int numberOfSubstrings(String s) {
      int []freq = new int[3];
        int count=0;
        int n = s.length();
        int i=0;
        for(int j=0; j < n; j++){
            char ch = s.charAt(j);
           freq[ch-'a']++;
            while(freq[0] >0 && freq[1] > 0 && freq[2] > 0){
                count += n-j;
                freq[s.charAt(i)-'a']--;
                i++;
               
            }
        }
        return count;
    }
}