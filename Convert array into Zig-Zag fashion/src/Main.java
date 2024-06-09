public class Main {
    public static void zigZag(int n, int[] arr) {
        boolean flag =true;
        for(int i =0;i<n-1;i++){
            if(flag){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }else{
                if(arr[i]<arr[i+1]){
                    int k = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=k;
                }
            }
            flag = !flag;
        }
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigZag(n,arr);
        for(int i:arr) System.out.print(i+" ");
    }
}