public class Main {
    public static void printArr(int n, int[] arr) {
        for (int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void setToZero(int n, int[] arr) {
        for (int i=0;i<n;i++) arr[i]=0;
        printArr(n,arr);
    }
    public static void xor1ToN(int n, int[] arr) {
        for (int i=0;i<n;i++) arr[i]=arr[i]^i;
        printArr(n,arr);
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        xor1ToN(n,arr);
        setToZero(n,arr);
    }
}