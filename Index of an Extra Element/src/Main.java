public class Main {
    public static int findExtra(int n, int[] arr1, int[] arr2) {
        int ans=0;
        for(int i:arr1) ans=ans^i;
        for(int i:arr2) ans=ans^i;
        for(int i=0;i<n;i++) if(arr1[i]==ans) return i;
        return -1;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr1 = {2,4,6,8,9,10,12}, arr2 = {2,4,6,8,10,12};
        System.out.println(findExtra(n,arr1,arr2));
    }
}