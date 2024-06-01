import java.util.HashMap;

public class Main {
    public static String oddEven(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(char ch:s.toCharArray()) m.put(ch,m.getOrDefault(ch,0)+1);
        int x=0,y=0;
        for(char ch:m.keySet()) {
            if(m.get(ch)%2==0   && (ch-'0')%2==0) x++;
            if(m.get(ch)%2!=0   && (ch-'0')%2!=0) y++;
        }
        return (x+y)%2==0? "EVEN":"ODD";
    }
    public static void main(String[] args) {
        String s = "abbbcc";
        System.out.println(oddEven(s));
    }
}