import java.util.ArrayList;

public class Main {
    public static void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        vis[node]=true;
        ans.add(node);
        for (int i: adj.get(node)) if (!vis[i]) dfs(i,vis,adj,ans);
    }
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[V];
        vis[0]=true;
        dfs(0,vis,adj,ans);
        return ans;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        l3.add(4);
        ArrayList<Integer> l4=new ArrayList<>();
        adj.add(l1);
        adj.add(l2);
        adj.add(l3);
        adj.add(l4);
        ArrayList<Integer> ans=dfsOfGraph(V,adj);
        System.out.println(ans);
    }
}