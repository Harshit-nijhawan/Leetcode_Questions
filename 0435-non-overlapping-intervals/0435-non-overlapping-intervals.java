class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(o -> o[1]));
        int ans = 0;
        int end = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(end > intervals[i][0]) ans++;
            else end = intervals[i][1];
        }
        return ans;
    }
}