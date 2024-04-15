import java.util.Arrays;

public class Main {
    public static int[] countElements(int[] a, int[] b, int n, int[] query, int q) {
        Arrays.sort(b);
        int[] res = new int[q];
        for(int i = 0; i<q; i++){
            int t = 0;
            for(int val : b){
                if(val <= a[query[i]]) t++;
                else break;
            }
            res[i] = t;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 3,q = 2;
        int[] a = {4,1,2}, b = {1,7,3}, query = {0,1};
        int[] ans=countElements(a,b,n,query,q);
        for (int i:ans) System.out.print(i+" ");
    }
}