class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        int len = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
            return Integer.compare(a[1], b[1]);
            }
        });
        for(int i=1; i<len; i++){
            if (intervals[i][0] < intervals[i - 1][1]) {
                intervals[i][1] = intervals[i - 1][1];
                count++;
            }
        }
        return count;
    }
}