import java.util.*;
public class First_negative_integer {
    public static long[] printFirstNegativeInteger(long[] A, int N, int K) {
        long[] ans=new long[N-K+1];
        Queue<Integer> q=new LinkedList<>();
        for (int i=0;i<N;i++){
            if (A[i]<0) q.add(i);
        }
        for (int i=0;i<N-K+1;i++){
            if (q.size()>0 && q.peek()<i) q.remove();
            if (q.size()>0 && q.peek()<=i+K-1) ans[i]=A[q.peek()];
            else if (q.size()==0) ans[i]=0;
            else ans[i]=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 5,K = 2;
        long[] A = {-8, 2, 3, -6, 10};
        long[] ans=printFirstNegativeInteger(A,N,K);
        for (long i:ans) System.out.print(i+" ");
    }
}
