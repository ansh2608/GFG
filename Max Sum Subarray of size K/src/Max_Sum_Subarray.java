import java.util.*;
public class Max_Sum_Subarray {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long ans=0,temp=0;
        int i=0,j=0;
        while(j<N){
            if(j-i+1<=K){
                temp+=Arr.get(j);
                j++;
            }else{
                ans=Math.max(ans,temp);
                temp-=Arr.get(i);
                i++;
            }
        }
        ans=Math.max(ans,temp);
        return ans;
    }
    public static void main(String[] args) {
        int N = 4, K = 2;
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(100);
        Arr.add(200);
        Arr.add(300);
        Arr.add(400);
        System.out.println(maximumSumSubarray(K,Arr,N));
    }
}
