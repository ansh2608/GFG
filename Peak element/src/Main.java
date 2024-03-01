public class Main {
    public static int peakElement(int[] arr,int n){
        int left=0,right=n-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if (arr[mid]>arr[mid+1]) right=mid;
            else left=mid+1;
        }
        return left;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,2,3};
        System.out.println(peakElement(arr,n));
    }
}