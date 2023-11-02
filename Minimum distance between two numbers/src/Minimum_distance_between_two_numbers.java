public class Minimum_distance_between_two_numbers {
    static int minDist(int[] a, int n, int x, int y){
        int x_idx = -1,y_idx = -1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i] == x) x_idx = i;
            if(a[i] == y) y_idx = i;
            if(x_idx!=-1 && y_idx!= -1) ans = Math.min(ans,Math.abs(x_idx-y_idx));
        }
        if(x_idx==-1 || y_idx== -1) return -1;
        return ans;
    }
    public static void main(String[] args) {
        int N = 4;
        int[] A= {1,2,3,2};
        int x = 1, y = 2;
        System.out.println(minDist(A,N,x,y));
    }
}
