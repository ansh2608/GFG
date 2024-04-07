public class Main {
    public static int maxDotProduct(int n, int m, int[] a, int[] b) {
        int[][] dp = new int[n + 1][m + 1];
        for(int j = 1; j <= m; j++) dp[0][j] = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++) for(int j = 1; j <= m; j++) dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] + a[i - 1] * b[j - 1]);
        return dp[n][m];
    }
    public static void main(String[] args) {
        int n = 5,m = 3;
        int[] a = {2, 3, 1, 7, 8};
        int[] b = {3, 6, 7};
        System.out.println(maxDotProduct(n,m,a,b));
    }
}