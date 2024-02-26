import java.util.*;
public class Main {
    public static List<String> AllPossibleStrings(String s) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int length = 1; length <= s.length() - i; length++) {
                ans.add(s.substring(i, i + length));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(AllPossibleStrings(s));
    }
}