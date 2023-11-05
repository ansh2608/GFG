import java.util.*;

public class Top_K_Frequent_Elements_in_Array {
    class Pair {
        int key, val;
        Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = nums.length-1; i >= 0; i--) map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        ArrayList<Pair> list = new ArrayList<>();
        for(int key: map.keySet()) list.add(new Pair(key, map.get(key)));
        Collections.sort(list, (a, b)->{
            if(a.val == b.val) return b.val*b.key - a.val*a.key;
            else return b.val - a.val;
        });
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) ans[i] = list.get(i).key;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4};
        int k = 2;
        int[] ans=topK(arr,k);
        System.out.println(arr[ans[0]]);
        System.out.println(ans[1]);
    }
}
