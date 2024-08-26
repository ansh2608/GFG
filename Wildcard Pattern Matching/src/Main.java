public class Main {
    public int wildCard(String pattern, String str) {
        int n = str.length();
        int m = pattern.length();
        int[][] dp = new int[n + 1][m + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) dp[i][0] = 0;
        for (int j = 1; j <= m; j++) {
            if (pattern.charAt(j - 1) == '*') dp[0][j] = dp[0][j - 1];
            else dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (pattern.charAt(j - 1) == str.charAt(i - 1) || pattern.charAt(j - 1) == '?') dp[i][j] = dp[i - 1][j - 1];
                else if (pattern.charAt(j - 1) == '*') dp[i][j] = dp[i - 1][j] | dp[i][j - 1];
                else dp[i][j] = 0;
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}