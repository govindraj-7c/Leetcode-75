class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int average = 0;

        for(int i = 0; i < k; i++) {
            average += nums[i];
        }

        int maxAverage = average;

        for(int i = k; i < nums.length; i++) {
            average = average + nums[i] - nums[i-k];
            maxAverage = average > maxAverage ? average : maxAverage;
        }

        return (double)maxAverage / k;
    }
}