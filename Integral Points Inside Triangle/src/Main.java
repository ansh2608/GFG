public class Main {
    public static long InternalCount(long[] p, long[] q, long[] r) {
        long a = Math.abs(p[0]*(q[1]-r[1]) + q[0]*(r[1]-p[1]) + r[0]*(p[1]-q[1]));
        long b = gcd(p,q) + gcd(q,r) + gcd(r,p);
        return (a - b + 2)/2;
    }
    public static long gcd(long[] a, long[] b) {
        long numa = Math.abs(a[0] - b[0]);
        long numb = Math.abs(a[1] - b[1]);
        while (numb != 0) {
            long temp = numb;
            numb = numa%numb;
            numa = temp;
        }
        return numa;
    }
    public static void main(String[] args) {
        long[] p = {0,0}, q = {0,5}, r = {5,0};
        System.out.println(InternalCount(p,q,r));
    }
}