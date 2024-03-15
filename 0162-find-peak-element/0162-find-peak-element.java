class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int left = 0, right = len-1;
        int mid = 0;
        while(left<=right){
            mid = left+(right-left)/2;
            if(mid+1>len-1 || nums[mid]>nums[mid+1]){
                if(mid-1<0||nums[mid]>nums[mid-1]){
                    return mid;
                }
                else{
                    right = mid-1;
                }
            }
            else if(mid-1<0 || nums[mid]>nums[mid-1]){
                if(nums[mid] > nums[mid+1]) {
                    return mid;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(nums[mid-1]>nums[mid+1]) right = mid-1;
                else left = mid+1;
            }
        }
        return mid;
    }
}