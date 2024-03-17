class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1, right = piles[piles.length-1];
        int ans = 0;
        while(left<right){
            int mid = left + (right - left)/2;
            boolean midH = getHours(mid, piles,h);
            if(midH) right = mid;
            else left = mid+1;
        }
        return left;
    }
    public boolean getHours(int k, int[] arr, int h){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans += (arr[i]/k);
            int rem = arr[i] % k;
            if(rem != 0) ans += 1; 
        }
        return (ans<=h);
    }
}