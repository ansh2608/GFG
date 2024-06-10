import java.util.Arrays;

public class Main {
    public static void matchPairs(int n, char[] nuts, char[] bolts) {
        Arrays.sort(nuts);
        Arrays.sort(bolts);
    }
    public static void main(String[] args) {
        int n = 5;
        char[] nuts = {'@', '%', '$', '#', '^'}, bolts = {'%', '@', '#', '$', '^'};
        matchPairs(n,nuts,bolts);
    }
}