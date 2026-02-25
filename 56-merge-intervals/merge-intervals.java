class Solution {
    public int[][] merge(int[][] intervals) {

         List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
             int currstart = intervals[i][0];
            int currend = intervals[i][1];

            if(currstart <= end ){
                end = Math.max(end, currend);
               
            }else{
                 result.add(new int[]{start, end});
                end = currend;
                start = currstart;
                
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }
}