public class Main {
    public static int noOfGasStationsBetween(int[] arr, double dist) {
        int cnt = 0, n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            double stationsInBetween = (arr[i + 1] - arr[i]) / dist;
            cnt += stationsInBetween;
        }
        return cnt;
    }
    public static double findSmallestMaxDist(int[] arr, int k) {
        int n = arr.length;
        double maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) maxi = Math.max(maxi, (double) (arr[i + 1] - arr[i]));
        double low = 0, high = maxi, diff = 1e-6; // 10^-6
        while(high - low > diff) {
            double mid = low + (high - low) / 2;
            if(noOfGasStationsBetween(arr, mid) <= k) high=mid;
            else low=mid;
        }
        return high;
    }
    public static void main(String[] args) {
        int[] stations = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 9;
        System.out.println(findSmallestMaxDist(stations,k));
    }
}