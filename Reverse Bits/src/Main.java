public class Main {
    static Long reversedBits(Long x) {
        long num = 0;
        for(int i = 0; i<32; i++){
            long bit = (x & (1 << i)) > 0 ? 1: 0;
            num = num | (bit << (31-i));
        }
        return num;
    }
    public static void main(String[] args) {
        long x = 1;
        System.out.println(reversedBits(x));
    }
}