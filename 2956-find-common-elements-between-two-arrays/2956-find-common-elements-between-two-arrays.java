class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] s1 = new int[101];
        int[] s2 = new int[101];
        int[] ans = new int[2];
        for(int i : nums1){
            s1[i] = 1;
        }
        for(int j : nums2){
            s2[j] = 1;
        }
        for(int k : nums1){
            ans[0] += s2[k];
        }
        for(int l : nums2){
            ans[1] += s1[l];
        }
        return ans;
    }
}