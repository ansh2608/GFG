import java.util.Arrays;

public class Main {
    public static int max_courses(int n, int total, int[] cost) {
        int[][] dp=new int[n+1][total+1];
        for (int[] row:dp) Arrays.fill(row,-1);
        return solve(n,total,cost,0,dp);
    }
    public static int solve(int y,int total,int[] cost,int i,int[][] dp){
        if (i==y || total==0) return 0;
        if (dp[i][total]!=-1) return dp[i][total];
        if (total>=cost[i]) return dp[i][total]=Math.max(solve(y,total,cost,i+1,dp),1+solve(y,total-cost[i]+(int)Math.floor(0.9*cost[i]),cost,i+1,dp));
        else return dp[i][total]=solve(y,total,cost,i+1,dp);
    }
    public static void main(String[] args) {
        int n = 2 , total = 10;
        int[] cost = {10, 9};
        System.out.println(max_courses(n,total,cost));
    }
}