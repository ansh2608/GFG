import java.util.*;

public class Main {
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()) temp.add(st.pop());
        st.add(x);
        while(!temp.isEmpty()) st.add(temp.pop());
        return st;
    }
    public static void main(String[] args) {
        int x = 2;
        Stack<Integer> st=new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(8);
        System.out.println(insertAtBottom(st,x));
    }
}