class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newLower = newInterval[0];
        int newUpper = newInterval[1];
       

        List<int[]> res = new ArrayList<>();
         int i = 0;
         int n = intervals.length;

         while(i < n && intervals[i][1] < newLower){
            res.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
         }
         while(i < n && intervals[i][0] <= newUpper){
            newLower = Math.min(newLower, intervals[i][0]);
            newUpper = Math.max(newUpper, intervals[i][1]);
            i++;
         }

        res.add(new int[]{newLower, newUpper});
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}