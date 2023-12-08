public class Transform_to_prime {
    static boolean isPrime(int num){
        if (num==1 || num==0) return false;
        for (int i=2;i<=num/2;i++) if (num%i==0) return false;
        return true;
    }
    static int minNumber(int[] arr, int N) {
        int sum=0;
        for (int i:arr) sum+=i;
        int diff=0;
        while (!isPrime(sum+diff)) diff++;
        return diff;
    }
    public static void main(String[] args) {
        int N=5;
        int[] arr = {2, 4, 6, 8, 12};
        System.out.println(minNumber(arr,N));
    }
}
