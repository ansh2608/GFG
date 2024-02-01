import java.util.HashSet;

public class Main {
    public static boolean checkPangram  (String s) {
        if (s.length()<26) return false;
        s=s.toLowerCase();
        HashSet<Character> set=new HashSet<>();
        for (char ch:s.toCharArray()) {
            if (ch>='a' && ch<='z') set.add(ch);
        }
        if (set.size()<26) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "Bawds jog, flick quartz, vex nymph";
        System.out.println(checkPangram(s));
    }
}