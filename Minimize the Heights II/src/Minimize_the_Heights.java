import java.util.Arrays;

public class Minimize_the_Heights {
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int min_elem, max_elem;
        int ans = arr[n-1] - arr[0];
        for (int i=1 ; i<=n-1; i++){
            if (arr[i] >= k){
                max_elem = Math.max(arr[i-1] + k, arr[n-1] - k );
                min_elem = Math.min(arr[0] + k, arr[i] - k );
                ans = Math.min(ans, max_elem - min_elem);
            }
            else
                continue;
        }
        return ans;
    }
    public static void main(String[] args) {
        int K = 2, N = 4;
        int[] Arr = {1, 5, 8, 10};
        System.out.println(getMinDiff(Arr,N,K));
    }
}
