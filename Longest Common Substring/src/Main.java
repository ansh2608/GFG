public class Main {
    static int longestCommonSubstr(String s1, String s2) {
        int x = s1.length(),y = s2.length(),ans = 0;
        int[][]dp = new int[x+1][y+1];
        for(int i=1;i<x+1;i++){
            for(int j=1;j<y+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }else dp[i][j] = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}