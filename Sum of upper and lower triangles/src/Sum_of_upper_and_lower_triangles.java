import java.util.*;
public class Sum_of_upper_and_lower_triangles {
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int ans_l=0,ans_u=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j>=i) ans_u+=matrix[i][j];
                if (j<=i) ans_l+=matrix[i][j];
            }
        }
        ans.add(ans_u);
        ans.add(ans_l);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                matrix[i][k]=sc.nextInt();
            }
        }
        System.out.println(sumTriangles(matrix,n));
    }
}
