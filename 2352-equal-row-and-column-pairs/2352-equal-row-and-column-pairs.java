class Solution {
    public int equalPairs(int[][] grid) {
        int row = 0;
        int temp = 0;
        int curr = 0;
        int pair = 0;
        while(temp < grid.length){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=0; j<grid.length; j++){
                map.put(j, grid[row][j]);
            }

            for(int i=0; i<grid.length; i++){
                for(int k=0; k<grid.length; k++){
                    if(map.get(k) != grid[k][i]){
                        curr = 0;
                        break;
                    }
                    else{
                        curr = 1;
                    }
                }
                pair += curr;
            }
            temp++;
            row++;
        }
        return pair;
    }
}