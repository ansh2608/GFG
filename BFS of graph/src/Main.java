import java.util.*;

public class Main {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] isVisited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        isVisited[0]=true;
        while (!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for (int i: adj.get(node)){
                if (!isVisited[i]) {
                    isVisited[i]=true;
                    q.add(i);
                }
            }
        }
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
        ArrayList<Integer> ans=bfsOfGraph(V,adj);
        System.out.println(ans);
    }
}