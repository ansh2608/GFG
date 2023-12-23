import java.util.Arrays;

public class count_n_by_k_occurence {
    static int countOccurence(int[] arr, int n, int k) {
        int freq = n/k;
        Arrays.sort(arr);
        int c = 1;
        int temp = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]==arr[i-1]) c++;
            else{
                if(c>freq)temp++;
                c = 1;
            }
        }
        if(c>freq) temp++;
        return temp;
    }
    public static void main(String[] args) {
        int N = 8, k = 4;
        int[] arr = {3,1,2,2,1,2,3,3};
        System.out.println(countOccurence(arr,N,k));
    }
}
