public class Main {
    public static int countPartitions(int n, int d, int[] arr) {
        int mod=1000000007;
        int sum=0;
        for(int ele:arr) sum+=ele;
        int target=(sum-d)/2;
        if((sum-d)%2!=0) return 0;
        if(target<0 || target >sum) return 0;
        int[][] dp=new int[n+1][target+1];
        dp[0][0]=1;
        for(int i=1;i<n+1;i++){
            int num=arr[i-1];
            for(int j=0;j<target+1;j++){
                if(num<=j) dp[i][j]=(dp[i-1][j]+dp[i-1][j-num])%mod;
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}