public class Main {
    public static int isPossible(int[][] paths) {
        for (int i=0;i<paths.length;i++){
            int c=0;
            for (int j=0;j< paths.length;j++) if (paths[i][j]==1) c++;
            if (c%2==1) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[][] paths = {   {0,1,1,1,1},
                            {1,0,0,1,0},
                            {1,0,0,1,0},
                            {1,1,1,0,1},
                            {1,0,0,1,0}     };
        System.out.println(isPossible(paths));
    }
}