import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static ArrayList<Integer> repeatedRows(int[][] matrix, int m, int n){
        ArrayList<Integer> ans=new ArrayList<>();
        Set<ArrayList<Integer>> set = new HashSet<>();
        for (int i=0;i<m;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for (int j=0;j<n;j++) temp.add(matrix[i][j]);
            if (set.contains(temp)) ans.add(i);
            else set.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        int R = 2, C = 2;
        int[][] matrix = {{1, 0}, {1, 0}};
        ArrayList<Integer> ans=repeatedRows(matrix,R,C);
        System.out.println(ans);
    }
}