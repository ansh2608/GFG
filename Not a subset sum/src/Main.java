public class Main {
    public long findSmallest(int[] arr) {
        long smallestMissing = 1;
        for (int i : arr) {
            if (i > smallestMissing) break;
            smallestMissing += i;
        }
        return smallestMissing;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}