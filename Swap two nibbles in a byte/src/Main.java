public class Main {
    static int swapNibbles(int n) {
        int highNibble = (n & 0xF0) >> 4;
        int lowNibble = (n & 0x0F) << 4;
        return highNibble | lowNibble;
    }
    public static void main(String[] args) {
        System.out.println(swapNibbles(100));
        System.out.println(swapNibbles(129));
    }
}