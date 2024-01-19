public class Main {
    public static int f(int[][] arr,int i,int j,int[][] dp){
        if(i==arr.length-1) return arr[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int path1=Integer.MIN_VALUE;
        if(j>0&&i<arr.length-1) path1=arr[i][j]+f(arr,i+1,j-1,dp);
        int path2=Integer.MIN_VALUE;
        if(i<arr.length-1&&j<arr[0].length-1) path2=arr[i][j]+f(arr,i+1,j+1,dp);
        int path3=Integer.MIN_VALUE;
        if(i<arr.length-1) path3=arr[i][j]+f(arr,i+1,j,dp);
        int ans=Math.max(path1,Math.max(path2,path3));
        return dp[i][j]=ans;
    }
    static int maximumPath(int N, int[][] arr) {
        int n=arr.length;
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<dp.length;i++) for(int j=0;j<dp[0].length;j++) dp[i][j]=-1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr[0].length;i++) ans=Math.max(ans,f(arr,0,i,dp));
        return ans;
    }
    public static void main(String[] args) {
        int N = 2;
        int[][] Matrix = {{348, 391}, {618, 193}};
        System.out.println(maximumPath(N,Matrix));
    }
}