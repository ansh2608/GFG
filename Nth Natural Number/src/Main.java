public class Main {
    public static long findNth(long n) {
        String res = "";
        while(n > 0){
            res = (n % 9) + res;
            n /= 9;
        }
        return Long.valueOf(res);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}