class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        solution(rooms,visited,0);
        for(boolean i : visited){
            if(!i) return false;
        }
        return true;
    }
    public void solution(List<List<Integer>> rooms, boolean[] visited, int curr){
        if(visited[curr]) return;
        visited[curr] = true;
        for(int i : rooms.get(curr)){
            solution(rooms,visited,i);
        }
    }
}