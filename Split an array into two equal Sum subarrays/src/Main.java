public class Main {
    public boolean canSplit(int[] arr) {
        int sum=0,split=0,count=0;
        for(int i:arr) sum+=i;
        for(int i=arr.length-1;i>0;i--){
            sum-=arr[i];
            split+=arr[i];
            if(sum==split){
                count++;
                break;
            }
        }
        if(count==1) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}