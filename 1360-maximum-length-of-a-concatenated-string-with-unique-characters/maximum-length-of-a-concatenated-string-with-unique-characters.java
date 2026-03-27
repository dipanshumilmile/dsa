class Solution {
    public int maxLength(List<String> arr) {
        List<Integer> masks = new ArrayList<>();

        for(String s : arr){
            int mask = 0;
            boolean valid = true;

            for(char ch: s.toCharArray()){
                int bit = ch - 'a';

                if((mask & (1 << bit))!=0){
                    valid = false;
                    break;
                }
                mask |= (1 << bit);
            }
            if(valid){
                masks.add(mask);
            }
        }
        return backtrack(masks, 0, 0);
    }
    private int backtrack(List<Integer> masks, int index, int currMask){
        int max = Integer.bitCount(currMask);

        for(int i=index; i<masks.size(); i++){
            if((currMask & masks.get(i))==0){
                max = Math.max(max, backtrack(masks, i+1, currMask | masks.get(i)));
            }
        }
         return max;
}

    }
   