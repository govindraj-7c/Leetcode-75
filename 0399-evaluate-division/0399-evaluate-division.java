class Solution {
    class Pair{
        String dest;
        double wt;
        public Pair(String dest, double wt){
            this.dest = dest;
            this.wt = wt;
        }
    }
    public double[] calcEquation(List<List<String>> e, double[] v, List<List<String>> q) {
        HashMap<String, ArrayList<Pair>> graph = new HashMap<>();
        for(int i=0; i<e.size(); i++){
            String src = e.get(i).get(0);
            String dest = e.get(i).get(1);
            graph.putIfAbsent(src, new ArrayList<>());
            graph.putIfAbsent(dest, new ArrayList<>());
            graph.get(src).add(new Pair(dest, v[i]));
            graph.get(dest).add(new Pair(src, 1/v[i]));
        }

        double[] res = new double[q.size()];
        for(int i=0; i<q.size(); i++){
            res[i] = dfs(graph, q.get(i).get(0), q.get(i).get(1), new HashSet<>());
        }
        return res;
    }
    public double dfs(HashMap<String, ArrayList<Pair>> graph, String src, String dest, HashSet<String> visited){
        visited.add(src);

        if(!(graph.containsKey(src)) || !(graph.containsKey(dest))){
            return -1.0;
        }

        if(src.equals(dest)) {
            return 1.0;
        }              

        for(Pair p : graph.get(src)){
            if(!visited.contains(p.dest)){
                double ans = dfs(graph, p.dest, dest, visited);
                if(ans != -1.0){
                    return ans*p.wt;
                }
            }
        }
        return -1;
    }
}