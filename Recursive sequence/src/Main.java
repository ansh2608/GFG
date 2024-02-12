public class Main {
    public static long fun(int m,int n,long curv){
        if (n==m) return 0;
        long temp=1;
        for (int i=0;i<n;i++){
            temp=((temp*curv)%1000000007);
            curv++;
        }
        return (temp+fun(m,n+1,curv))%1000000007;
    }
    public static long sequence(int n){
        return fun(n+1,1,1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sequence(n));
    }
}