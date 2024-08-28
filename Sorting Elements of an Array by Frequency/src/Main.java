import java.util.*;

public class Main {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int nums : arr){
            ans.add(nums);
            freq.put(nums , freq.getOrDefault(nums,0)+1);
        }
        Collections.sort(ans , (a,b) -> {
            int fa = freq.get(a);
            int fb = freq.get(b);
            if(fa == fb){
                return a - b;
            }
            else{
                return fb - fa;
            }
        });
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}