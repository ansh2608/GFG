import java.util.*;

public class Main {
    public ArrayList<Integer> max_of_subarrays(int k, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.getLast()]) deque.removeLast();
            deque.addLast(i);
        }
        for (int i = k; i < arr.length; i++) {
            result.add(arr[deque.getFirst()]);
            while (!deque.isEmpty() && deque.getFirst() <= i - k) deque.removeFirst();
            while (!deque.isEmpty() && arr[i] >= arr[deque.getLast()]) deque.removeLast();
            deque.addLast(i);
        }
        result.add(arr[deque.getFirst()]);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}