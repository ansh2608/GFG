import java.util.*;
public class Interleave_First_Half_with_Second_Half {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for (int i=1;i<=N/2;i++) st.push(q.remove());
        while (st.size()>0) q.add(st.pop());
        for (int i=1;i<=N/2;i++) st.push(q.remove());
        while (st.size()>0) {
            q.add(st.pop());
            q.add(q.remove());
        }
        while (q.size()>0) st.add(q.remove());
        while (st.size()>0) list.add(st.pop());
        return list;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int N=q.size();
        ArrayList<Integer> ans=rearrangeQueue(N,q);
        System.out.println(ans);
    }
}
