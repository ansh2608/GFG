public class Main {
    int[][] rotateMatrix(int k, int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;

        k = k % cols;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][(j + cols - k) % cols] = mat[i][j];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}