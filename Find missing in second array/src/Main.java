import java.util.*;

public class Main {
    public static ArrayList<Integer> findMissing(int[] a, int[] b, int n, int m){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<m;i++) map.put(b[i],map.getOrDefault(b[i],0)+1);
        for(int i=0;i<n;i++) if(map.get(a[i]) == null)ans.add(a[i]);
        return ans;
    }
    public static void main(String[] args) {
        int n = 6, m = 5;
        int[] a = {1, 2, 3, 4, 5, 10}, b = {2, 3, 1, 0, 5};
        System.out.println(findMissing(a,b,n,m));
    }
}