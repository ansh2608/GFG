import java.util.HashSet;

public class Main {
    public static int countPairs(int[][] mat1, int[][] mat2, int n, int x) {
        int count=0;
        HashSet<Integer> us = new HashSet<>();
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) us.add(mat2[i][j]);
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) if (us.contains(x - mat1[i][j])) count++;
        return count;
    }
    public static void main(String[] args) {
        int n = 3, x = 21;
        int[][] mat1 = {{1, 5, 6}, {8, 10, 11}, {15, 16, 18}};
        int[][] mat2 = {{2, 4, 7}, {9, 10, 12}, {13, 16, 20}};
        System.out.println(countPairs(mat1,mat2,n,x));
    }
}