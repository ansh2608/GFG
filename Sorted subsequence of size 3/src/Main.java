import java.util.*;

public class Main {
    public List<Integer> find3Numbers(int[] arr) {
        int n = arr.length;
        int[] lftMin = new int[n];
        int[] rgtMax = new int[n];
        lftMin[0] = arr[0];
        rgtMax[n-1] = arr[n-1];
        for (int i=1; i<n; i++) {
            lftMin[i] = Math.min(lftMin[i-1], arr[i]);
            rgtMax[n-i-1] = Math.max(rgtMax[n-i], arr[n-i-1]);
        }
        for (int i=1; i<n-1; i++) {
            if (lftMin[i-1] < arr[i] && arr[i] < rgtMax[i+1])
                return Arrays.asList(lftMin[i-1], arr[i], rgtMax[i+1]);
        }
        return new ArrayList<Integer>();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}