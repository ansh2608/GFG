public class Modified_Game_of_Nim {
    static int findWinner(int n, int[] A){
        int xor = 0;
        for (int num : A) xor ^= num;
        if (xor == 0 || n % 2 == 0) return 1;
        else return 2;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] A = {3, 3, 2};
        System.out.println(findWinner(n,A));
    }
}
