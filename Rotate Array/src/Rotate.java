public class Rotate {
    static void print(int[] arr, int d, int n){
        d=d%(arr.length);
        int []arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i<d){
                arr1[arr.length-d+i]=arr[i];
            }else{
                arr1[i-d]=arr[i];
            }
        }
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
    }
    public static void main(String[] args) {
        int N = 10, D = 3;
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        print(arr,D,N);
    }
}
