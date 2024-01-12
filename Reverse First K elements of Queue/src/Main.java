import java.util.*;
public class Main {
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st=new Stack<>();
        for (int i=1;i<=k;i++) st.add(q.poll());
        while (!st.isEmpty()) q.add(st.pop());
        for (int i=1;i<=q.size()-k;i++) q.add(q.poll());
        return q;
    }
    public static void main(String[] args) {
        int k=3;
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> ans=modifyQueue(q,k);
        System.out.println(ans);
    }
}