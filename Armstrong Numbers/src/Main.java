public class Main {
    static String armstrongNumber(int n){
        int num=n,sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        if(sum==n) return "Yes";
        return "No";
    }
    public static void main(String[] args) {
        int n=372;
        System.out.println(armstrongNumber(n));
    }
}