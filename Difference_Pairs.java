import java.util.Arrays;
import java.util.Scanner;

public class Difference_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int B = sc.nextInt();
            B = Math.max(B, -B);
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);

            int i = 0, j = 0, match = 0;
            while (i < N && j < N) {
                int D = A[j] - A[i];
                if (D == B) {
                    match = 1;
                    break;
                } else if (D > B) {
                    i++;
                } else {
                    j++;
                }
            }

            System.out.println(match);
        }

        sc.close();
    }
}
