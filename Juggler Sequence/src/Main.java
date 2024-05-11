import java.util.*;

public class Main {
    static List<Long> jugglerSequence(long n) {
        List<Long> sequence = new ArrayList<>();
        sequence.add(n);
        while (n > 1) {
            if (n % 2 == 0) n = (long) Math.floor(Math.sqrt(n));
            else n = (long) Math.floor(Math.sqrt(n) * Math.sqrt(n) * Math.sqrt(n));
            sequence.add(n);
        }
        return sequence;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}