class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int no : nums){
            if(no <= a){
                a = no;
            }
            else if(no <= b){
                b = no;
            }
            else{
                return true;
            }
        }
        return false;
    }
}