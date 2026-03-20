class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> st = new HashSet<>();
        int n = s.length();

        int count = 1 << k;  

        for(int i=k; i<=n; i++){
            String sub = s.substring(i-k, i);

            st.add(sub);

            if (st.size() == count) return true;
        }
        return false;
    }
}