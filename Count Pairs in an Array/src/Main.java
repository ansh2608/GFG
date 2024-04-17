public class Main {
    static int countPairs(int[] arr, int n) {
        for(int i=0;i<n;++i) arr[i] = i * arr[i];
        return quick(arr,0,arr.length-1);
    }
    static int quick(int[] arr,int l,int r){
        if(l>=r)return 0;
        int mid=(l+(r-l)/2);
        int an=quick(arr,l,mid);
        an+=quick(arr,mid+1,r);
        an+=merge(arr,l,mid,r);
        return an;
    }
    static int merge(int[] arr,int l,int mid,int r){
        int[] temp=new int[r+1];
        for(int a=l;a<=r;a++) temp[a]=arr[a];
        int i=l,j=mid+1,k=l;
        int count=0;
        while(i<=mid && j<=r){
            if(temp[i]<=temp[j]) arr[k++]=temp[i++];
            else{
                arr[k++]=temp[j++];
                count+=(mid-i+1);
            }
        }
        while(i<=mid) arr[k++]=temp[i++];
        while(j<=r) arr[k++]=temp[j++];
        return count;
    }
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {8, 4, 2, 1};
        System.out.println(countPairs(arr,n));
    }
}