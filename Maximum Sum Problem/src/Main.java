public class Main {
    public static int helper(int n){
        if(n==0 || n==1) return n;
        return Math.max(n,(helper(n/2)+helper(n/3)+helper(n/4)));
    }
    public static int maxSum(int n) {
        return helper(n);
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(maxSum(n));
    }
}