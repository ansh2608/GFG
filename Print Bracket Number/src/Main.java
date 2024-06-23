import java.util.*;
public class Main {
    public static ArrayList<Integer> bracketNumbers(String str) {
        Stack<Integer>st = new Stack<>();
        ArrayList<Integer> lst = new ArrayList<>();
        int val =1 ;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='(') {
                st.push(val);
                lst.add(st.peek());
                val++;
            }
            else if(ch==')') lst.add(st.pop());
        }
        return lst;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}