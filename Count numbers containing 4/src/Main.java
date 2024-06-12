public class Main {
    public static int countNumberswith4(int n) {
        int countDigit=0;
        for(int i=1; i<=n; i++){
            String str = Integer.toString(i);
            if(str.contains("4")) countDigit ++;
        }
        return countDigit;
    }
    public static void main(String[] args) {
        int n=44;
        System.out.println(countNumberswith4(n));
    }
}