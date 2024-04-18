public class Main {
    public static int[] twoRepeated(int arr[], int n) {
        int[] ans = new int[n];
        int  val = 0;
        for(int i=0; i<n+2; i++){
            int x = Math.abs(arr[i]);
            if(arr[x] < 0) ans[val++] = x;
            arr[x] = -arr[x];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}