import java.util.*;

class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
public class Main {
    private static void bfs(int nrow, int ncol, char [][]grid, int [][]visit){

        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(nrow, ncol));
        visit[nrow][ncol]=1;

        while(!q.isEmpty()){
            Pair pair = q.remove();
            int i = pair.first;
            int j = pair.second;

            for(int k=-1; k<=1; k++){
                for(int l=-1; l<=1; l++){
                    int row = k+i;
                    int col = l+j;

                    if(row>=0 && row<n && col>=0 && col<m && visit[row][col]==0 && grid[row][col]=='1'){
                        q.add(new Pair(row, col));
                        visit[row][col]=1;
                    }
                }
            }
        }
    }

    public static int numIslands(char[][] grid) {
        int n = grid.length,m = grid[0].length,cnt = 0;
        int [][]visit = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1' && visit[i][j] == 0){
                    bfs(i, j, grid, visit);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        char[][] grid = {{4,2},{0,1},{1,0},{1,1},{1,0}};
        System.out.println(numIslands(grid));
    }
}