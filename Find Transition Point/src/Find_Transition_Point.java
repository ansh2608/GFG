public class Find_Transition_Point {
    static int transitionPoint(int[] arr, int n){
        int st=0,end=n-1;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==1) {
                ans= mid;
                end=mid-1;
            }
            else st=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1};
        System.out.println(transitionPoint(arr,arr.length));
    }
}
