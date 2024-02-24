public class Iterative_Approach {
    public static int maxSum(int n) {
        if (n == 0 || n == 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = Math.max(i, (dp[i / 2] + dp[i / 3] + dp[i / 4]));
        return dp[n];
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(maxSum(n));
    }
}
