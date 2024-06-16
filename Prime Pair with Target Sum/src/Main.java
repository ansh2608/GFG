import java.util.*;

public class Main {
    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=n/2;i++){
            if(isPrime(i) && isPrime(n-i)){
                list.add(i);
                list.add(n-i);
                return list;
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        if(num <= 3) {
            return true;
        }
        if(num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for(int i = 5; i * i <= num; i += 6) {
            if(num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(getPrimes(n));
    }
}