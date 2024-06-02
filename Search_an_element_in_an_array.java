import java.util.Scanner;

public class Search_an_element_in_an_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        boolean found = false; // Flag to indicate if X is found
        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            if (element == X) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
