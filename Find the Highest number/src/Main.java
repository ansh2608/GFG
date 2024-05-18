import java.util.List;

public class Main {
    public static int findPeakElement(List<Integer> a) {
        int max=0;
        for(Integer ar:a)  max=Math.max(max,ar);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}