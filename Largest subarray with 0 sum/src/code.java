import java.util.HashMap;

public class code {
    static int maxLen(int[] arr, int n) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ps=0,maxLength=0;
        mp.put(0,-1);
        for (int i=0;i<arr.length;i++){
            ps+=arr[i];
            if (mp.containsKey(ps)){
                int curr=i-mp.get(ps);
                maxLength=Math.max(curr,maxLength);
            }
            else{
                mp.put(ps,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int N = 8;
        int[] A = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(A,N));
    }
}
