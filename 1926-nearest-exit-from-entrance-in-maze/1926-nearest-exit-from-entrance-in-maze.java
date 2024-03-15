class Solution {
    static class Node{
        int row;
        int col;
        int count;
        public Node(int row, int col, int count){
            this.row = row;
            this.col = col;
            this.count = count;
        }
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        int rLen = maze.length;
        int cLen = maze[0].length;
        int minCount = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(entrance[0], entrance[1], 0));
        while(!q.isEmpty()){
            Node curr = q.remove();
            int rowN = curr.row;
            int colN = curr.col;
            int countN = curr.count;
            maze[rowN][colN] = '+';
            int[] rowPos = {1,-1,0,0};
            int[] colPos = {0,0,1,-1};
            for(int i=0; i<4; i++){
                int rowE = rowN + rowPos[i];
                int colE = colN + colPos[i];
                if(rowE>=0 && rowE<rLen && colE>=0 && colE<cLen && maze[rowE][colE] == '.'){
                    maze[rowE][colE] = '+';
                    q.add(new Node(rowE,colE,countN+1));
                    if(colE==0 || colE==cLen-1 || rowE==0 || rowE==rLen-1){
                        minCount = countN+1;
                        return minCount;
                    }
                }
            }
        }
        return -1;
    }
}