class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n+1];

        Arrays.fill(ans, -1);
        return solution(nums, ans, 0, n);
    }

    public int solution(int[] nums, int[] ans, int i, int n){
        if(i >= n) return 0;

        if(ans[i] != -1) return ans[i];

        int steal = nums[i] + solution(nums, ans, i+2, n);
        int skip = solution(nums, ans, i+1, n);

        return ans[i] = Math.max(steal, skip);
    }
}