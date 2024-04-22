public class Main {
    public static int minRow(int n, int m, int[][] a) {
        int count = m,res = 0;
        for(int i=0; i<n; i++){
            int c = 0;
            for(int b : a[i]) c += b;
            if(c < count){
                count = c;
                res = i;
            }
        }
        return res+1;
    }
    public static void main(String[] args) {
        int n = 4,m = 4;
        int[][] a = {{1, 1, 1, 1},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {1, 1, 1, 1}};
        System.out.println(minRow(n,m,a));
    }
}