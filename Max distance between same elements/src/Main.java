import java.util.HashMap;

public class Main {
    public int maxDistance(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(!mp.containsKey(arr[i])) mp.put(arr[i],i);
            else mp.put(arr[i],Math.min(mp.get(arr[i]),i));
        }
        int minm=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(mp.containsKey(arr[i])) minm=Math.max(minm,i-mp.get(arr[i]));
        }
        return minm;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}