public class Techfest_and_the_Queue {
    public static long helper(long n){
        long c=0;
        while(n%2==0) {
            c++;
            n/=2;
        }
        for(int i=3; i<=(int)Math.sqrt(n); i+=2) {
            while(n%i==0) {
                c++;
                n/=i;
            }
        }
        if(n>2) c++;
        return c;
    }
    public static long sumOfPowers(long a, long b) {
        long sum=0;
        for (long i=a;i<=b;i++){
            sum+=helper(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        long a = 9 ,b = 12;
        System.out.println(sumOfPowers(a,b));
    }
}
