import java.util.List;

public class Main {
    public long findMaxProduct(List<Integer> arr) {
        if(arr.size() == 1) return arr.get(0);
        long prod = 1;
        int zero = 0, non_zero = 0, maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) != 0){
                prod = (prod * arr.get(i)) % 1000000007;
                non_zero = 1;
            }
            else{ zero = 1;}
            if(arr.get(i) < 0 && arr.get(i) > maxi) maxi = arr.get(i);
        }
        if(non_zero != 1) return 0;
        if(arr.size() == 2 && zero == 1 && prod < 0) return 0;
        if(prod < 0) prod /= maxi;
        return prod;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, -2, 4, 3};
        System.out.println("Hello world!");
    }
}