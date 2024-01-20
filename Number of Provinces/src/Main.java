import java.util.ArrayList;

public class Main {
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[node]=true;
        for(int i:adj.get(node)) if(!vis[i]) dfs(i,adj,vis);
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs=new ArrayList<>();
        for (int i=0;i<V;i++) adjLs.add(new ArrayList<>());
        for (int i=0;i<V;i++){
            for (int j=0;j<V;j++){
                if (adj.get(i).get(j)==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        boolean[] vis=new boolean[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,adjLs,vis);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] adj={   {1, 0, 1},
                        {0, 1, 0},
                        {1, 0, 1}};

    }
}