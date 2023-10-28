import java.util.Arrays;

public class Find_triplets {
    static boolean triplets(int[] arr, int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l=i+1;
            int h=n-1;
            while(l<h){
                int sum=arr[i]+arr[l]+arr[h];
                if(sum==0) return true;
                else if(sum<0)  l++;
                else    h--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr= {1,0,2,3,-1};
        System.out.println(triplets(arr,n));
    }
}
