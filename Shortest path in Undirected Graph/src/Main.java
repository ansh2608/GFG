import java.util.*;

public class Main {
    public static int[] shortestPath(int[][] edges,int n,int m ,int src) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<m;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int dist[]=new int[n];
        Arrays.fill(dist,-1);
        Queue<Integer> queue=new LinkedList<>();
        dist[src]=0;
        queue.add(src);
        while(!queue.isEmpty()){
            int u=queue.poll();
            for(int v:adj.get(u)){
                if(dist[v]==-1){
                    dist[v]=dist[u]+1;
                    queue.add(v);
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int n = 9, m = 10, src=0;
        int[][] edges= {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        for(int i : shortestPath(edges, n, m, src)) System.out.print(i+" ");
    }
}