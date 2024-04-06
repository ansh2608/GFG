public class Main {
    public static Long countWays(int n) {
        return((long)1+((long)n/2));
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countWays(n));
    }
}