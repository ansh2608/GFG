public class Main {
    public static long getCount(int n) {
        if (n == 1) return 10;
        int[][] moves = {
                {0, 8},
                {1, 2, 4},
                {2, 1, 3, 5},
                {3, 2, 6},
                {4, 1, 5, 7},
                {5, 2, 4, 6, 8},
                {6, 3, 5, 9},
                {7, 4, 8},
                {8, 5, 7, 9, 0},
                {9, 6, 8}
        };
        long[] dpPrevious = new long[10];
        long[] dpCurrent = new long[10];
        for (int i = 0; i < 10; i++) dpPrevious[i] = 1;
        for (int length = 2; length <= n; length++) {
            for (int key = 0; key < 10; key++) {
                dpCurrent[key] = 0;
                for (int move : moves[key]) dpCurrent[key] += dpPrevious[move];
            }
            long[] temp = dpPrevious;
            dpPrevious = dpCurrent;
            dpCurrent = temp;
        }
        long result = 0;
        for (int i = 0; i < 10; i++) result += dpPrevious[i];
        return result;
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println(getCount(n));
    }
}