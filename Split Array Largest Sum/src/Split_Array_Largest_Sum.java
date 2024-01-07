import java.util.Arrays;

public class Split_Array_Largest_Sum {
    static int splitArray(int[] nums , int N, int k) {
        int left = Arrays.stream(nums).max().orElse(0);
        int right = Arrays.stream(nums).sum();
        int res = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, mid, k)) {
                res = mid;
                right = mid - 1;
            } else left = mid + 1;
        }
        return res;
    }
    public static boolean canSplit(int[] nums, int largest, int k) {
        int subarray = 0, currSum = 0;
        for (int n : nums) {
            currSum += n;
            if (currSum > largest) {
                subarray++;
                currSum = n;
            }
        }
        return subarray + 1 <= k;
    }
    public static void main(String[] args) {
        int N = 4, K = 3;
        int[] arr = {1, 2, 3, 4};
        System.out.println(splitArray(arr,N,K));
    }
}
