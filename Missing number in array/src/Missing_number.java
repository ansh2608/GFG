import java.util.Arrays;

public class Missing_number {
    static int missing(int[] arr,int n){
        int naturalSum = n*(n+1)/2;
        int sum = 0;
        for(int i=0; i<n-1; i++){
            sum += arr[i];
        }
        return naturalSum-sum;
    }
    public static void main(String[] args) {
        int N = 10;
        int[] arr = {6,1,2,8,3,4,7,10,5};
        System.out.println(missing(arr,N));
    }
}
