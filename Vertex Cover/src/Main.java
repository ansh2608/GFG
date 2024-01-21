public class Main {
    public static boolean isVis(int[][] edges,boolean[] vis){
        for(int[] edge:edges) if (!vis[edge[0]]&&!vis[edge[1]]) return false;
        return true;
    }
    public static int helper(int n,int[][] edges,boolean[] vis){
        if (isVis(edges,vis)) return 0;
        if (n==0) return (int)1e9;
        vis[n]=true;
        int res=1+helper(n-1,edges,vis);
        vis[n]=false;
        res=Math.min(res,helper(n-1,edges,vis));
        return res;
    }
    public static int vertexCover(int n, int m, int[][] edges) {
        return helper(n,edges,new boolean[n+1]);
    }
    public static void main(String[] args) {
        int N=5 ,M=6;
        int[][] edges={{1,2},{4, 1}, {2, 4}, {3, 4}, {5, 2}, {1, 3}};
        System.out.println(vertexCover(N,M,edges));
    }
}