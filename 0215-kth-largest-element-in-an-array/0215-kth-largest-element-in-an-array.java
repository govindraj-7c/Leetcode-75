class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int no : nums){
            pq.add(no);
        }
        int ans = 0;
        for(int i=0; i<k; i++){
            ans = pq.peek();
            pq.remove();
        }
        return ans;
    }
}