import java.util.Arrays;

public class Main {
    public static int findPair(int n, int x, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int low = i+1;
            int high = n - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] - x == arr[i]) return 1;
                else if (arr[mid] - x > arr[i]) high = mid - 1;
                else low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}