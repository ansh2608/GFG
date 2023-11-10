import java.util.*;
public class Number_following_a_pattern {
    static String printMinNumberForPattern(String S){
        StringBuilder sb=new StringBuilder();
        Stack<Integer>st=new Stack<>();
        int num=1;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if (ch=='D'){
                st.push(num);
                num++;
            }
            else{
                st.push(num);
                num++;
                while(st.size()>0){
                    sb.append(st.pop());
                }
            }
        }
        st.push(num);
        while(st.size()>0){
            //System.out.println(st.pop());
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="D";
        System.out.println(printMinNumberForPattern(s));
    }
}
