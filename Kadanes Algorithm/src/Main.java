public class Main {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int localSum = 0;
        for (int i = 0; i < arr.length; i++) {
            localSum += arr[i];
            if (localSum > maxSum) maxSum = localSum;
            if (localSum < 0) localSum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}