public class Approach_2 {
    static int maxIndexDiff(int[] a, int n) {
        int[] maxRight = new int[n];
        maxRight[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) maxRight[i] = Math.max(maxRight[i + 1], a[i]);
        int maxDiff = 0;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (a[i] <= maxRight[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else i++;
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int n = 2;
        int[] a = {1, 10};
        System.out.println(maxIndexDiff(a,n));
    }
}
