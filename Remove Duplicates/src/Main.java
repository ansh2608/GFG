import java.util.HashSet;

public class Main {
    String removeDups(String str) {
        StringBuilder ans = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.add(c)) ans.append(c);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}