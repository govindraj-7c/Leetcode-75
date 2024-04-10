class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pair = new int[n][2];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            pair[i][0] = nums1[i];
            pair[i][1] = nums2[i];
        }

        Arrays.sort(pair, new Comparator<int[]>() {
            public int compare(int[] lhs, int[] rhs){
                return rhs[1] - lhs[1];
            }
        });

        long ans = 0, total = 0;

        for(int i=0; i<n; i++){
            total += pair[i][0];
            pq.add(pair[i][0]);

            if(i >= k) total -= pq.poll();
            if(i >= (k-1)) ans = Math.max(ans, total*pair[i][1]);
        }

        return ans;
    }
}