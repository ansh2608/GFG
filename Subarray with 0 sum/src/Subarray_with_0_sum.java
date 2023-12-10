import java.util.*;
public class Subarray_with_0_sum {
    static boolean findsum(int arr[],int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                return true;
            }
            map.put(sum,i);
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4,2,-3,1,6};
        System.out.println(findsum(arr,n));
    }
}
