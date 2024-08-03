import java.util.*;
public class Main {
    public static int celebrity(int[][] M){
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<M.length;i++) st.push(i);
        while (st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if (M[v1][v2]==0) st.push(v1);
            else if (M[v2][v1]==0) st.push(v2);
        }
        if (st.isEmpty()) return -1;
        int p=st.pop();
        for (int i=0;i<M.length;i++) {
            if (p!=i){
                if (M[p][i]==1) return -1;
                if (M[i][p]==0) return -1;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[][] mat = {     {0, 1, 0},
                            {0, 0, 0},
                            {0, 1, 0}      };
        System.out.println(celebrity(mat));
    }
}