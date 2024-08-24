import java.util.Arrays;
public class Main {
    static int f(int w,int[] wt, int[] val,int i, int [][] dp){
        if(i==0){
            if(w>=wt[0]) return val[0];
            else return 0;
        }
        if(dp[i][w]!=-1) return dp[i][w];
        int ntake=f(w,wt,val,i-1,dp);
        int take=Integer.MIN_VALUE;
        if(w>=wt[i]) take=val[i]+f(w-wt[i],wt,val,i-1,dp);
        return dp[i][w]=Math.max(ntake,take);
    }
    static int knapSack(int W, int[] wt, int[] val) {
        int [][] dp=new int[val.length][W+1];
        for(int []row:dp) Arrays.fill(row,-1);
        return f(W,wt,val,val.length-1,dp);
    }
    public static void main(String[] args) {
        int W = 4;
        int[] val = {1,2,3}, wt = {4,5,1};
        System.out.println(knapSack(W,val,wt));
    }
}