public class How_Many_x {
    static int countX(int L, int R, int X) {
        int count=0;
        for (int i=L+1;i<R;i++){
            int temp=i;
            while (temp>0){
                if (temp%10==X) count++;
                temp/=10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int L=10;
        int R=19;
        int X=1;
        System.out.println(countX(L,R,X));
    }
}
