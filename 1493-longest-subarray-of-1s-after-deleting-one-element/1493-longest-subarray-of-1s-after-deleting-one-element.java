class Solution {
    public int longestSubarray(int[] nums) {
        int end = 0;
        int start = 0;
        int zeros = 0;
        int ans;
        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            end++;
            if(zeros>1){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
        }
        if(zeros == 0){
            ans = (end - start) - 1;
        }
        else{
            ans = end-start -1;
        }
        return ans;
    }
}