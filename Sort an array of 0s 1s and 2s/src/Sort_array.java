public class Sort_array {
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void display(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void sort(int[] arr, int n){
        int st=0,mid=0,end=n-1;
        while (mid<=end){
            if (arr[mid]==0) {
                swap(arr,st,mid);
                st++;
                mid++;
            }
            else if (arr[mid]==1) mid++;
            else {
                swap(arr,mid,end);
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int N = 5;
        int[] arr= {0,2,1,2,0};
        sort(arr,N);
        display(arr);
    }
}
