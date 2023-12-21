import java.util.*;
public class Candy {
    static int minCandy(int n, int[] ratings) {
        int res[]=new int[n];
        Arrays.fill(res,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                res[i]=res[i-1]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                res[i-1]=Math.max(res[i-1],res[i]+1);
            }
        }
        int sum=0;
        for(int x:res){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int N = 3;
        int[] ratings = {1, 0, 2};
        System.out.println(minCandy(N,ratings));
    }
}
