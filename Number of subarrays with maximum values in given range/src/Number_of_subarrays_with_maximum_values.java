public class Number_of_subarrays_with_maximum_values {
    static long countSubarrays(int[] a, int n, int L, int R)  {
        long ans = 0;
        long max = -1, l=0, m = 0;
        for(int i=0; i<n; i++){
            if(a[i] >= L && a[i] <=R){
                l++; max = Math.max(max,a[i]);
                ans -= (m*(m+1))/2; m =0;
            }
            else if(a[i] < L){
                m++; l++;
            } else if(a[i] > R) {
                ans += (l*(l+1))/2;
                ans -= (m*(m+1))/2;
                l = 0; m = 0;
            }
            if(i == n-1){
                ans += (l*(l+1))/2;
                ans -= (m*(m+1))/2;
                l = 0; m = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] Arr = {2, 0, 11, 3, 0};
        int L = 1, R = 10;
        System.out.println(countSubarrays(Arr, Arr.length, L,R));
    }
}
