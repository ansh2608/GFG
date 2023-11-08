import java.util.*;
public class Print_Matrix_in_snake_Pattern {
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n= matrix.length;
        for (int i=0;i<n;i++){
            if (i%2==0){
                for (int j=0;j<n;j++){
                    ans.add(matrix[i][j]);
                }
            }
            else {
                for (int j=n-1;j>=0;j--){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{45, 48, 54}, {21, 89, 87},{70, 78, 15}};
        int n= matrix.length;
        System.out.println(snakePattern(matrix));
    }
}
