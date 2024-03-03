import java.util.Arrays;

public class Main {
    public static String printLargest(int n, String[] arr) {
        Arrays.sort(arr,(x,y)->(y+x).compareTo(x+y));
        return String.join("",arr);
    }
    public static void main(String[] args) {
        String[] arr =  {"3", "30", "34", "5", "9"};
        System.out.println(printLargest(arr.length, arr));
    }
}