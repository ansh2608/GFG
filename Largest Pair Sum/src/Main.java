import java.util.Arrays;

public class Main {
    public static int pairsum(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int sum=arr[n-1]+arr[n-2];
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}