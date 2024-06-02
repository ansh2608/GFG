import java.util.*;
public class Main {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        ArrayList<Integer> ans= new ArrayList<>() ;
        int xor=0;
        for(int i=q-1;i>=0;i--)
        {
            if(queries[i][0]==0)
                ans.add(queries[i][1]^xor);
            else
                xor^=queries[i][1];
        }
        ans.add(xor);
        Collections.reverse(ans);
        Collections.sort(ans) ;
        return ans;
    }
    public static void main(String[] args) {
        int q = 5;
        int[][] queries = {{0, 6}, {0, 3}, {0, 2}, {1, 4}, {1, 5}};
        System.out.println("Hello world!");
    }
}