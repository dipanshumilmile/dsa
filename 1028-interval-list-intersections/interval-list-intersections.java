class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();
        int i=0;
        int j=0;
        
        while(i < firstList.length  && j < secondList.length){
            if(firstList[i][1] >= secondList[j][0] && firstList[i][0] <= secondList[j][1]){
                int interval[] = new int[2];
                interval[0] = Math.max(secondList[j][0], firstList[i][0]);
                interval[1] = Math.min(secondList[j][1], firstList[i][1]);
                res.add(interval);
            }
            if(firstList[i][1] < secondList[j][1]){
                i++;
            }else j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}