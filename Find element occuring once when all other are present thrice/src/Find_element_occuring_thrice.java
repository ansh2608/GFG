import java.util.HashMap;
import java.util.Map;

public class Find_element_occuring_thrice {
    static int singleElement(int[] arr , int N) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int num:arr) mp.put(num,mp.getOrDefault(num,0)+1);
        for (Map.Entry<Integer,Integer> entry:mp.entrySet()){
            int t=entry.getValue();
            if (t==1) return entry.getKey();
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 10, 1, 1};
        System.out.println(singleElement(arr,arr.length));
    }
}
