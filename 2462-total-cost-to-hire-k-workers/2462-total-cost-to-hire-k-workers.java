class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int i=0, j=n-1;
        int hire = 0;
        long cost = 0;

        while(hire < k){
            while(pq1.size() < candidates && i<=j){
                pq1.add(costs[i]);
                i++;
            }
            while(pq2.size() < candidates && j>=i){
                pq2.add(costs[j]);
                j--;
            }

            int min_pq1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            int min_pq2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;

            if(min_pq1 <= min_pq2){
                cost += min_pq1;
                pq1.remove();
            }
            else{
                cost += min_pq2;
                pq2.remove();
            }

            hire++;
        }

        return cost;
    }
}