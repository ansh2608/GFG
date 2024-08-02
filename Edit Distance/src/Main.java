public class Main {
    public static int editDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] memo = new int[n+1][m+1];
        for(int i = 0; i<=n; i++) memo[i][0] = i;
        for(int j = 0; j<=m; j++) memo[0][j] = j;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=m; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) memo[i][j] = memo[i-1][j-1];
                else memo[i][j] = 1+Math.min(memo[i-1][j-1], Math.min(memo[i-1][j], memo[i][j-1]));
            }
        }
        return memo[n][m];
    }
    public static void main(String[] args) {
        String str1 = "geek", srt2 = "gesek";
        System.out.println(editDistance(str1,srt2));
    }
}