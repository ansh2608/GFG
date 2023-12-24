import java.util.*;
public class Buy_Maximum_Stocks {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        long[] arr = new long[n];
        for(int i =0;i<n;i++) arr[i] = price[i]*100000+(i+1);
        Arrays.sort(arr);
        int count = 0;
        for(int i =0;i<n;i++){
            int pr = (int)arr[i]/100000;
            int no = (int)arr[i]%100000;
            if(pr*no > k){
                count += k/pr;
                k = k - pr*(k/pr);
            }else{
                count = count+no;
                k = k - pr*no;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] price = {10,7,19};
        int k = 45;
        System.out.println(buyMaximumProducts(price.length,k,price));
    }
}
