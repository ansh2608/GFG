public class ReachtheNthpoint {
    static int nthPoint(int n) {
        int t1=1,t2=2;
        if(n==1) return 1;
        if(n==2) return 2;
        for(int i=2;i<n;i++){
            int t3=t1+t2;
            t1=t2%(1000000007);
            t2=t3%(1000000007);
        }
        return t2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(nthPoint(n));
    }
}
