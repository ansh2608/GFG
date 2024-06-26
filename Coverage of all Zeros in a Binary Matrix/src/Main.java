public class Main {
    public static int findCoverage(int[][] matrix) {
        int count = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 1) continue;
                count += (i-1 >= 0 && matrix[i-1][j] == 1)? 1 : 0;
                count += (j-1 >= 0 && matrix[i][j-1] == 1)? 1 : 0;
                count += (i+1 < matrix.length && matrix[i+1][j] == 1)? 1 : 0;
                count += (j+1 < matrix[0].length && matrix[i][j+1] == 1)? 1 : 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix={{0, 1, 0},{0, 1, 1},{0, 0, 0}};
        System.out.println(findCoverage(matrix));
    }
}