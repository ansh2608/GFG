public class Code {
    static long Sum_of_all_Divisors(int N){
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            if(N%i==0) ans+=N;
            else ans+=i*(N/i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int N=5;
        System.out.println(Sum_of_all_Divisors(N));
    }
}
