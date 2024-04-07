class Solution {
    int[][] ans;
    public int uniquePaths(int m, int n) {
        ans = new int[m][n];
        return dp(m,n,0,0);
    }
    public int dp(int m, int n, int i, int j){
        if(i == m-1 && j == n-1){
            return 1;
        }
        if(i<0 || i>=m || j<0 || j>=n){
            return 0;
        }
        if(ans[i][j] != 0) return ans[i][j];

        int right = dp(m,n,i,j+1);
        int down = dp(m,n,i+1,j);

        return ans[i][j] = right + down;
    }
}