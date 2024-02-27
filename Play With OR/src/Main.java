public class Main {
    public static int[] game_with_number (int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) arr[i] |= arr[i + 1];
        return arr;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 11, 1, 2, 3};
        int[] ans=game_with_number(arr,n);
        for(int i:ans) System.out.print(i+" ");
    }
}