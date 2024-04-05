import java.util.Arrays;

public class Main {
    public static int min_operations(int []nums){
        int n = nums.length, maxi = 1;
        int[] dp = new int[n];
        Arrays.fill(nums,1);
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j] && (nums[i] - nums[j] >= (i - j))) {
                    dp[i] = Math.max(1 + dp[j], dp[i]);
                    maxi = Math.max(maxi, dp[i]);
                }
            }
        }
        return n - maxi;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 5, 4};
        System.out.println(min_operations(nums));
    }
}