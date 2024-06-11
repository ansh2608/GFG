import java.util.Arrays;

public class Main {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        long sum=0;
        int sarr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            sarr[i][0]=arr[i];
            sarr[i][1]=brr[i];
            sarr[i][2]=Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(sarr,(a, b)->b[2]-a[2]);
        for(int i=0;i<n;i++){
            if(sarr[i][0]>sarr[i][1]){
                if(x>0){
                    sum+=sarr[i][0];
                    x--;
                }
                else{
                    sum+=sarr[i][1];
                    y--;
                }
            }
            else{
                if(y>0){
                    sum+=sarr[i][1];
                    y--;
                }
                else{
                    sum+=sarr[i][0];
                    x--;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}