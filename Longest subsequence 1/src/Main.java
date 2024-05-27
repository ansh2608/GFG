import java.util.*;

public class Main {
    public static int longestSubseq(int n, int[] a) {
        Map<Integer,Integer> mm = new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            mm.put(a[i],1+Math.max(mm.getOrDefault(a[i]-1,0),mm.getOrDefault(a[i]+1,0)));
            ans=Math.max(ans,mm.get(a[i]));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] a= {10, 9, 4, 5, 4, 8, 6};
        System.out.println(longestSubseq(n,a));
    }
}