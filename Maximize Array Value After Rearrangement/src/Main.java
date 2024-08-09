import java.util.Arrays;

public class Main {
    public static int Maximize(int[] arr) {
        long sum=0L;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) sum = (sum + (long)i*arr[i])%1000000007;
        return (int) sum%1000000007;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(Maximize(arr));
    }
}