public class Power_Of_Numbers {
    static long power(int N,int R){
        if (R==0) return 1;
        if (R==1) return N;
        if (R%2==0) {
            long res=power(N,R/2);
            return (long)(res*res)%1000000007;
        }
        else return (long)(N*power(N,R-1))%1000000007;
    }
    public static void main(String[] args) {
        int n=2,r=3;
        System.out.println(power(n,r));
    }
}
