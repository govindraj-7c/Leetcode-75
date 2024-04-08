class Solution {
    int m, n;
    int[][] ans;

    public int solution(String s1, String s2, int i, int j){
        if(i >= m || j >= n){
            return 0;
        }

        if(ans[i][j] != -1){
            return ans[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
            return ans[i][j] = 1 + solution(s1,s2,i+1,j+1);
        }
        else{

            return ans[i][j] = Math.max(solution(s1,s2,i+1,j), solution(s1,s2,i,j+1));
        }
           

    }

    public int longestCommonSubsequence(String s1, String s2) {
        m = s1.length();
        n = s2.length();
        ans = new int[s1.length()+1][s2.length()+1];

        for(int i=0; i<ans.length; i++){
            Arrays.fill(ans[i], -1);
        }

        return solution(s1,s2,0,0);
    }
}