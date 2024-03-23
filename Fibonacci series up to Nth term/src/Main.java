public class Main {
    public static int[] Series(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        for(int i=2 ; i<=n ;i++) ans[i] = (ans[i-1] + ans[i-2]) % 1000000007;
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int[] ans=Series(n);
        for (int i:ans) System.out.print(i+" ");
    }
}