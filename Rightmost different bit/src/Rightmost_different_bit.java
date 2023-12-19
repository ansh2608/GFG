public class Rightmost_different_bit {
    static int posOfRightMostDiffBit(int m, int n) {
        int cnt=1;
        int flag=0;
        while(m>0 || n>0){
            int a=m&1;
            int b=n&1;
            if(a!=b){
                flag=1;
                break;
            }
            cnt++;
            m=m>>1;
            n=n>>1;
        }
        return (flag==1)?cnt:-1;
    }
    public static void main(String[] args) {
        int m=11,n=9;
        System.out.println(posOfRightMostDiffBit(m,n));
    }
}
