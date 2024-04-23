public class Main {
    static int firstElement(int n) {
        int mod = 1000000007;
        int a = 1, b=1;
        int c = a+b;
        int i=1;
        while(i<n){
            a = b;
            b = c;
            c = (a%mod+b%mod)%mod;
            i++;
        }
        return a;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(firstElement(n));
    }
}