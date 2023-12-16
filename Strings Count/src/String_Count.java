public class String_Count {
    static long countStr(long n) {
        if (n==1) return 3;
        if (n==2) return 8;
        return (n*n*n+3*n+2)/2;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(countStr(n));
    }
}
