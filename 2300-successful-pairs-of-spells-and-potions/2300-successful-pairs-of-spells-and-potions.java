class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for(int i=0; i<spells.length; i++){
            spells[i] = solution(spells[i],potions,success);
        }
        return spells;
    }
    public int solution(int nums, int[] potions, long success){
            int n = potions.length;
            int left = 0, right = n-1;
            while(left<right){
                int mid = (left+right)/2;
                if((long)nums*potions[mid] < success){
                    left = mid+1;
                }
                else{
                    right = mid;
                }
            }
            if(left==n-1){
                if((long)nums*potions[left] < success){
                    return 0;
                }
            }
            return n-left;
    }
}