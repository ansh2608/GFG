import java.util.Stack;

public class Main {
    static boolean ispar(String x) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='{'||ch=='('||ch=='[') stack.push(ch);
            else{
                if(stack.isEmpty()) return false;
                else if(ch==')'&&stack.peek()=='(') stack.pop();
                else if(ch=='}'&&stack.peek()=='{') stack.pop();
                else if(ch==']'&&stack.peek()=='[') stack.pop();
                else return false;
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}