import java.util.Arrays;

public class Main {
    static int min_sprinklers(int[] gallery, int n) {
        int[] range=new int[n];
        Arrays.fill(range,-1);
        for (int i=0;i<n;i++){
            if (gallery[i]==-1) continue;
            int st=Math.max(0,i-gallery[i]);
            int end=Math.min(n,i+gallery[i]);
            range[st]=Math.max(range[st],end);
        }
        int res=0,cur=-1,next=-1;
        for (int i=0;i<n;i++){
            next=Math.max(next,range[i]);
            if (i>cur){
                res++;
                cur=next;
            }
            if (i>cur && range[i]==-1) return -1;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] gallery = {-1, 2, 2, -1, 0, 0};
        System.out.println(min_sprinklers(gallery,n));
    }
}