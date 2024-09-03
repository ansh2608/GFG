public class Main {
    public static int minOperations(String str1, String str2) {
        int s1 = str1.length();
        int s2 = str2.length();
        int[][] dp = new int[s1 + 1][s2 + 1];
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        int lcsLength = dp[s1][s2];
        return (s1 - lcsLength) + (s2 - lcsLength);
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}