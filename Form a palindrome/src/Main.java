public class Main {
    static int countMin(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];
        for (int length = 2; length <= n; length++) {  // length of substring
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (str.charAt(i) == str.charAt(j)) dp[i][j] = dp[i + 1][j - 1];
                else dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
            }
        }
        return dp[0][n - 1];
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}