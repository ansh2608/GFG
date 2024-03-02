import java.util.HashMap;
public class Main {
    public static int firstElementKTime(int n, int k, int[] a) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int num:a) {
            mp.put(num,mp.getOrDefault(num,0)+1);
            if (mp.get(num)>=k) return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 7, k = 2;
        int[] a = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(n,k,a));
    }
}