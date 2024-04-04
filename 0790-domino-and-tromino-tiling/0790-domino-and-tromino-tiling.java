class Solution {
    public int numTilings(int n) {
        int M = 1000000007;
        int[] ans = new int[n+1];
        if(n == 1 || n == 2) return n;

        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 5;

        for(int i=4; i<=n; i++){
            ans[i] = (2 * ans[i-1]%M + ans[i-3]%M) % M;
        }

        return ans[n];
    }
}