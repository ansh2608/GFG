public class Binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=4;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==k) ans=mid;
            if(arr[mid]<k) st=mid+1;
            else end=mid-1;
        }
        System.out.println(ans);
    }
}
