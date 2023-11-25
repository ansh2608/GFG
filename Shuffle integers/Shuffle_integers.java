class Solution {
    public void shuffleArray(int[] arr, int n) {
        int x = 10000;
        for (int i = 0; i < n / 2; i++) {
            arr[i] = arr[i] + arr[n / 2 + i] * x; // storing 2 values in 1 value by using this formula
        }

        int j = n - 1;
        for (int i = n / 2 - 1; i >= 0; i--) {
            arr[j] = arr[i] / x; // fetching the two values by using this value
            arr[j - 1] = arr[i] % x;
            j -= 2;
        }
    }
}
