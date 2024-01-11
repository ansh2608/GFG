import java.util.Stack;

public class Remove_K_Digits {
    public static String removeKdigits(String S, int K) {
        Stack<Character> st=new Stack<>();
        for (int i=0;i<S.length();i++){
            while (!st.isEmpty() && st.peek()>S.charAt(i) && K>0){
                st.pop();
                K--;
            }
            st.add(S.charAt(i));
        }
        while (K-->0) st.pop();
        if (st.isEmpty()) return "0";
        StringBuilder ans=new StringBuilder();
        while (!st.isEmpty()) ans.append(st.pop()+"");
        ans=ans.reverse();
        int index=0;
        while (index<ans.length()-1 && ans.charAt(index)=='0') index++;
        return ans.substring(index);
    }
    public static void main(String[] args) {
        String s="149811";
        int k=3;
        System.out.println(removeKdigits(s,k));
    }
}
