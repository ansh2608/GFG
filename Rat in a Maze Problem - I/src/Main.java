import java.util.ArrayList;

public class Main {
    public static void solve(int[][] mat, int i, int j, ArrayList<String> arr, String str, boolean[][] vis){
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || vis[i][j] || mat[i][j] == 0) return;
        if(i==mat.length-1 && j==mat[0].length-1){
            arr.add(str);
            return;
        }
        vis[i][j] = true;
        solve(mat, i+1, j, arr, str+'D', vis);
        solve(mat, i, j+1, arr, str+'R', vis);
        solve(mat, i-1, j, arr, str+'U', vis);
        solve(mat, i, j-1, arr, str+'L', vis);
        vis[i][j] = false;
    }
    public static ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> arr = new ArrayList<>();
        boolean[][] vis = new boolean[mat.length][mat[0].length];
        int n = mat.length;
        int m = mat[0].length;
        if(mat[0][0] == 0 || mat[n-1][m-1]==0){
            arr.add("-1");
            return arr;
        }
        solve(mat, 0, 0, arr, "", vis);
        return arr;
    }
    public static void main(String[] args) {
        int[][] mat = {     {1, 0, 0, 0},
                            {1, 1, 0, 1},
                            {1, 1, 0, 0},
                            {0, 1, 1, 1}       };
        System.out.println(findPath(mat));
    }
}