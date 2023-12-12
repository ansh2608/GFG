public class Gold_Mine_Problem {
    static int maxGold(int n, int m, int M[][]) {
        int dp[][] = new int[n][m];
        int ans = 0;
        for(int i=0; i<n; i++) dp[i][0] = M[i][0];
        for(int j=1; j<m; j++){
            for(int i=0; i<n; i++){
                int a =  0, b= 0, c= dp[i][j-1];
                if(i>=1) a = dp[i-1][j-1];
                if(i<n-1) b = dp[i+1][j-1];

                dp[i][j] = M[i][j] + Math.max(Math.max(a,b),c);
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] M = {{1, 3, 3}, {2, 1, 4}, {0, 6, 4}};
        System.out.println(maxGold(n,m,M));
    }
}
