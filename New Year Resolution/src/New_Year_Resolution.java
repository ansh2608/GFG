public class New_Year_Resolution {
    public static boolean isPossible(int N, int[] coins) {
        int sum=0;
        for(int i:coins)sum+=i;
        boolean[][] dp=new boolean[N+1][sum+1];
        return f(0,0,coins,dp);
    }
    static boolean f(int i,int sum,int[] coins,boolean[][] dp){
        if(sum!=0 && (sum%20==0 || sum%24==0 || sum==2024))return true;
        if(i>=coins.length)return false;
        if(dp[i][sum])return dp[i][sum];
        return dp[i][sum] |=f(i+1,sum+coins[i],coins,dp)||f(i+1,sum,coins,dp);
    }
    public static void main(String[] args) {
        int N = 8;
        int[] coins = {5, 8, 9, 10, 14, 2, 3, 5};
        System.out.println(isPossible(N,coins));
    }
}
