import java.util.*;
public class Main {
    void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean vis[]){
        vis[node] = true;
        for(int x : adj.get(node)){
            if(!vis[x]){
                dfs(adj,x,vis);
            }
        }
    }
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges)
    {
        // code here
        if((n-m)!=1){
            return false;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[] = new boolean[n];
        dfs(adj,0,vis);
        for(boolean x : vis){
            if(!x){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}