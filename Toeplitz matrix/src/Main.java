public class Main {
    public static boolean isToeplitz(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i-1>=0&&j-1>=0) if(mat[i-1][j-1]!=mat[i][j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] mat = {{6, 7, 8},{4, 6, 7},{1, 4, 6}};
        System.out.println(isToeplitz(mat));
    }
}