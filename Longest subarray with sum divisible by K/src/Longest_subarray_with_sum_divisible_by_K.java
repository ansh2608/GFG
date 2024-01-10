import java.util.HashMap;

public class Longest_subarray_with_sum_divisible_by_K {
    public static int longSubarrWthSumDivByK(int[] a, int n, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0,ans=0;
        mp.put(0,-1);
        for (int i=0;i<n;i++){
            sum+=a[i];
            int rem=sum%k;
            if (rem<0) rem+=k;
            if (!mp.containsKey(rem)) mp.put(rem,i);
            else ans=Math.max(ans,i-mp.get(rem));
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 5, K = 8;
        int[] arr = {-9, 0, 0, 0, 9};
        System.out.println(longSubarrWthSumDivByK(arr,N,K));
    }
}
