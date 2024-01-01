import java.util.HashMap;

public class Array_Pair_Sum_Divisibility {
    public static boolean canPair(int[] nums, int k) {
        if (nums.length%2!=0) return false;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int num : nums) {
            int remainder = (num % k + k) % k;
            mp.put(remainder, mp.getOrDefault(remainder, 0) + 1);
        }
        for (int num : nums) {
            int remainder = (num % k + k) % k;
            int complement = (k - remainder) % k;
            if (remainder == 0) {
                if (mp.getOrDefault(complement, 0) % 2 != 0) return false;
            }
            else if (mp.getOrDefault(remainder, 0) != mp.getOrDefault(complement, 0)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {9, 5, 7, 3};
        int k = 6;
        System.out.println(canPair(nums,k));
    }
}
