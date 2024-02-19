import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static int minValue(String s, int k){
        int[] fq=new int[26];
        for (char ch:s.toCharArray()) fq[ch-'a']++;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for (int f:fq) pq.add(f);
        while (k-->0){
            int element=pq.poll();
            pq.add(element-1);
        }
        int sum=0;
        while (!pq.isEmpty()) sum+=pq.peek()*pq.poll();
        return sum;
    }
    public static void main(String[] args) {
        String s = "abccc";
        int k = 1;
        System.out.println(minValue(s,k));
    }
}