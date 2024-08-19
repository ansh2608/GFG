import java.util.*;

public class Main {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr) {
            pq.add(i);
            if(pq.size()>k) pq.poll();
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}