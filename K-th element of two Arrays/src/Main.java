import java.util.Arrays;
public class Main {
    public static long kthElement(int k, int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++) res[i] = arr1[i];
        for(int i=0;i<arr2.length;i++) res[arr1.length+i] = arr2[i];
        Arrays.sort(res);
        return res[k-1];
    }
    public static void main(String[] args) {
        int k = 5;
        int[] arr1 = {2, 3, 6, 7, 9}, arr2 = {1, 4, 8, 10};
        System.out.println(kthElement(k,arr1,arr2));
    }
}