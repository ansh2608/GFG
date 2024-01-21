import java.util.*;
class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class Main {
    public static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean[] vis) {
        Queue<Node> q =  new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] =true;
        while(!q.isEmpty()) {
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();
            for(Integer it: adj.get(node)) {
                if(!vis[it]) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                }
                else if(par != it) return true;
            }
        }
        return false;
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);
        for(int i=0;i<V;i++) if(!vis[i]) if(checkForCycle(adj, i,vis)) return true;
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) adj.add(new ArrayList <> ());
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        boolean ans = isCycle(V, adj);
        if (ans) System.out.println("1");
        else System.out.println("0");
    }
}