public class Main {
    public static int padovanSequence(int n){
        final int MOD = 1000000007;
        if( n == 0 || n==1 || n==2) return 1;
        int p0 = 1, p1 = 1, p2 = 1;
        int cur = 0;
        for(int i=3;i<=n;i++) {
            cur = (p0+p1)%MOD;
            p0=p1;
            p1=p2;
            p2=cur;
        }
        return cur;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(padovanSequence(n));
    }
}