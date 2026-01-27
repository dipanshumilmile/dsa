class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left =0;
        int len=0;
        int count=0;
        for(int right=0; right<fruits.length; right++){
            int n =fruits[right];
            
            map.put(n, map.getOrDefault(n,0)+1);
            count++;
            
            if(map.size()>2){
                int leftFruit = fruits[left];
                 map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                map.remove(leftFruit);
    }

                left++;
                count--;
            }
            len = Math.max(len, count);

        }
        return len;
        

        

    }
}