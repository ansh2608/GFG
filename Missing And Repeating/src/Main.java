public class Main {
    int[] findTwoElement(int[] arr) {
        // code here

        int[] ans = new int[2];

        long n = arr.length;

        long s = (long) (n * (n + 1)) / 2;
        long ssq = (long) (n * (n + 1) * (2 * n + 1)) / 6;

        long missing = 0, repeating = 0;

        for (int i = 0; i < n; i++) {
            s -= arr[i];
            ssq -= (long) arr[i] * arr[i];
        }

        missing = (s + ssq / s) / 2;
        repeating = missing - s;

        ans[0] = (int)repeating;
        ans[1] = (int)missing;

        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}