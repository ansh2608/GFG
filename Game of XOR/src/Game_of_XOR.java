public class Game_of_XOR {
    static int gameOfXor(int N , int[] A) {
        int ans=A[0];
        if (N%2 == 0) return 0;
        for (int i=2;i<N; i+=2) ans=ans^A[i];
        return ans;
    }
    public static void main(String[] args) {
        int N = 3;
        int[] A = {1,2,3};
        System.out.println(gameOfXor(N,A));
    }
}
