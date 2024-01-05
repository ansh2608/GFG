public class Count_possible_ways {
    public static int TotalWays(int N) {
        long[] fib = new long[N+1];
        fib[0] = 1;
        fib[1] = 1;
        for(int i=2;i<N+1;i++) fib[i] = (fib[i-1] + fib[i-2]) % 1000000007;
        long res = fib[N] + fib[N-1];
        return (int)((res*res) % 1000000007);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(TotalWays(n));
    }
}
