import java.util.ArrayList;

public class Anti_Diagonal_Traversal {
    public static int[] antiDiagonalPattern(int[][] matrix) {
        int n=matrix.length,row=0,col=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while (row<n && col<n){
            int i=row,j=col;
            while (i<n && j>=0){
                ans.add(matrix[i][j]);
                i++;
                j--;
            }
            if (col<n-1) col++;
            else row++;
        }
        int[] res=new int[ans.size()];
        for (int i=0;i<res.length;i++) res[i]= ans.get(i);
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix= {{3,2,3},{4,5,1},{7,8,9}};
        int[] ans=antiDiagonalPattern(matrix);
        for (int i:ans) System.out.print(i+" ");
    }
}
