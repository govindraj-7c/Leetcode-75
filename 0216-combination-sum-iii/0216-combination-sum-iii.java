class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ansList = new ArrayList<>();
        solution(0,k,n,1, new ArrayList<>(), ansList);
        return ansList;
    }
    public void solution(int ans, int k, int n, int idx, List<Integer> list, List<List<Integer>> ansList){
        if(list.size() == k){
            if(ans == n){
                ansList.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i = idx; i<10; i++){
            list.add(i);
            solution(ans+i, k, n, i+1, list, ansList);
            list.remove(list.size()-1);
        }
    }
}