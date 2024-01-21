import java.util.*;
class Pair{
    int row;
    int col;
    int tm;
    Pair (int row,int col,int tm){
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}
public class Main {
    public static int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length,cntFresh=0;
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else vis[i][j]=0;
                if (grid[i][j]==1) cntFresh++;
            }
        }
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        int tm=0,cnt=0;
        while (!q.isEmpty()){
            int first=q.peek().row;
            int second=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(tm,t);
            q.remove();
            for (int i=0;i<4;i++){
                int nRow=first+delRow[i];
                int nCol=second+delCol[i];
                if (nRow>=0 && nCol>=0 && nRow<n && nCol<m && vis[nRow][nCol]==0 && grid[nRow][nCol]==1){
                    q.add(new Pair(nRow,nCol,t+1));
                    vis[nRow][nCol]=2;
                    cnt++;
                }
            }
        }
        if (cnt!=cntFresh) return -1;
        return tm;
    }
    public static void main(String[] args) {
        int[][] grid = {{0,1,2},{0,1,2},{2,1,1}};
        System.out.println(orangesRotting(grid));
    }
}