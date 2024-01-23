import java.util.*;
public class Main {
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) {
        int[] ans=new int[n];
        int[] inDegree=new int[n];
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<m;i++) {
            int u=prerequisites.get(i).get(1);
            int v=prerequisites.get(i).get(0);
            adj.get(u).add(v);
            inDegree[v]++;
        }
        ArrayList<Integer>l=new ArrayList<>();
        ArrayDeque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<n;i++) if(inDegree[i]==0) q.offerLast(i);
        while(!q.isEmpty()) {
            int node=q.pollFirst();
            l.add(node);
            for(int i=0;i<adj.get(node).size();i++) {
                int tp=adj.get(node).get(i);
                inDegree[tp]--;
                if(inDegree[tp]==0) q.offerLast(tp);
            }
        }
        if(l.size()!=n) return new int[0];
        for(int i=0;i<l.size();i++) ans[i]=l.get(i);
        return ans;
    }
    public static void main(String[] args) {
        int n = 4, m = 4;
        ArrayList<ArrayList<Integer>> prerequisites = new ArrayList<>();
        prerequisites.add(new ArrayList<>(List.of(1, 0)));
        prerequisites.add(new ArrayList<>(List.of(2, 0)));
        prerequisites.add(new ArrayList<>(List.of(3, 1)));
        prerequisites.add(new ArrayList<>(List.of(3, 2)));
        int[] ans=findOrder(n,m,prerequisites);
        for (int i:ans) System.out.print(i+" ");
    }
}