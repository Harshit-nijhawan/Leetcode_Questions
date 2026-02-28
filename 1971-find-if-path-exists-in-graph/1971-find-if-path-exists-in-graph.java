class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean vis[] = new boolean[n];
        return helper(graph,source,destination,vis);
    }
    public boolean helper(List<List<Integer>> edges, int src, int disc,boolean vis[]){
        if(src == disc) return true;
        vis[src] = true;
        for(int neb : edges.get(src)){
            if(!vis[neb] && helper(edges,neb,disc,vis)) return true;
        }
        return false;
    }
}