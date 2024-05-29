import java.util.Arrays;

public class Main {
    public static int findWinner(int n, int x, int y) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,0);
        arr[1]=1;
        for(int i=2;i<=n;i++){
            int j=i-1;
            if(j>=0 && arr[j]==0) arr[i]=1;
            j=i-x;
            if(j>=0 && arr[j]==0) arr[i]=1;
            j=i-y;
            if(j>=0 && arr[j]==0) arr[i]=1;
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n = 5 ,x = 3 ,y = 4;
        System.out.println("Hello world!");
    }
}