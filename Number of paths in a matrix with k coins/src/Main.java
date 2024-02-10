public class Main {
    public static long find(int n,int k,int [][]arr,int i,int j){
        if(i>=n || j>=n || k<0)  return 0;
        k=k-arr[i][j];
        if(i==n-1 && j==n-1 && k==0)return 1;
        return  find(n,k,arr,i,j+1)+find(n,k,arr,i+1,j);
    }
    public static long numberOfPath(int n, int k, int [][]arr) {
        return find(n,k,arr,0,0);
    }
    public static void main(String[] args) {
        int k = 12, n = 3 ;
        int[][] arr = {{1, 2, 3},{4, 6, 5},{3, 2, 1}};
        System.out.println(numberOfPath(n,k,arr));
    }
}