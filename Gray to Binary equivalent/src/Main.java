public class Main {
    public static int grayToBinary(int n) {
        int res = n;
        while(n>0){
            n>>=1;
            res ^= n;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(grayToBinary(n));
    }
}