class Solution {
    public String minWindow(String s, String t) {
        int []freq = new int[128];
         int []freq1 = new int[128];

        for(char c : t.toCharArray()){
            freq[c]++;
        }
        int i=0;
        int count=t.length();
        int minSub=Integer.MAX_VALUE;
        String ans="";
        for(int j=0; j<s.length(); j++){
            char c = s.charAt(j);
            freq1[c]++;
            if(freq[c]>=freq1[c]){
                
                count--;
            }
            if(count == 0){
                while(count == 0){
                   if(j - i + 1 < minSub){
                        minSub = j - i + 1;
                        ans = s.substring(i, j + 1);   // corrected substring
                    }

                    char c1 = s.charAt(i);
                    freq1[c1]--;

                    if(freq1[c1] < freq[c1]){
                        count++;
                    }

                    i++;


                    
                }
            }
            
        }
        return ans;
    }
}