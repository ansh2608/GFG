import java.util.Arrays;

public class Triplet_sum {
    static boolean triplet(int[] arr, int n, int x){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l=i+1;
            int h=n-1;
            while(l<h){
                int sum=arr[i]+arr[l]+arr[h];
                if(sum==x) return true;
                else if(sum<x)  l++;
                else    h--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 6, X = 11;
        int[] arr= {1,4,45,6,10,8};
        System.out.println(triplet(arr,n,X));
    }
}
