public class Main {
    static int maxIndexDiff(int[] a, int n) {
        int maxDiff=-1;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(a[i]<=a[j]){
                    maxDiff=Math.max(maxDiff,j-i);
                    break;
                }
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int n = 2;
        int[] a = {1, 10};
        System.out.println(maxIndexDiff(a,n));
    }
}