class Solution {
    public int findCircleNum(int[][] path) {
        int n = path.length;
        boolean[] visited = new boolean[n];
        int ans = 0;
        for(int i=0; i<visited.length; i++){
            if(visited[i] == false){
                ans++;
                getProvinces(path, i, visited);
            }
        }
        return ans;
    }
    public void getProvinces(int[][] path, int src, boolean[] visited){
        visited[src] = true;
        for(int i=0; i<path.length; i++){
            if(!visited[i] && path[src][i] == 1){
                getProvinces(path, i, visited);
            }
        }
    }
}