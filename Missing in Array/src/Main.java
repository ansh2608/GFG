public class Main {
    int missingNumber(int n, int[] arr) {
        if(n==1) return 1;
        int res=0, temp=0;
        for(int i=0; i<n-1; i++){
            res = res ^ arr[i];
            temp = temp ^ (i+1);
        }
        temp = temp ^ n;
        return temp^res;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}