class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[] = new boolean[n];
        return helper(adj,source,destination,vis);
        
    }
    public boolean helper(List<List<Integer>> edges,int src,int disc, boolean vis[]){
        if(src == disc) return true;
        vis[src] = true;
        for(int neb : edges.get(src)){
            if(!vis[neb] && helper(edges,neb,disc,vis)){
                return true;
            }
        }
        return false;
    }
}