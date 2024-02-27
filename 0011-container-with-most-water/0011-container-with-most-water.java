class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int max = 0;
        int right = height.length-1;
        while(left < right){
            int ans = Math.min(height[left], height[right]) * (right-left);
            max = Math.max(max,ans);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}