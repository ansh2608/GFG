public class Main {
    public static boolean isAdditiveSequence(String n) {
        int digit = 1;
        boolean res = false;
        while(digit <= n.length()/3 && digit <=9 ){
            int second = digit;
            while(second <= (n.length()-digit)/2 && second <=9){
                boolean pathCheck = rec( n.substring(digit+second ,n.length()), n.substring(0,digit), n.substring(digit,digit+second), second);            //System.out.println("CHECK "+ pathCheck);
                res= res || pathCheck ;
                second++;
            }
            digit++;
        }
        return res;
    }
    public static boolean rec(String sub,String n1,String n2 ,int digit) {
        if (sub.length() <= digit) return (Long.parseLong(n1) + Long.parseLong(n2) == Long.parseLong(sub));
        else {
            long num1 = (n1 != "") ? Long.parseLong(n1) : -1;
            long num2 = (n2 != "") ? Long.parseLong(n2) : -1;
            long sum1 = (digit + 1 <= sub.length() && sub.substring(0, digit + 1) != "") ? Long.parseLong(sub.substring(0, digit + 1)) : -1;
            long sum2 = (sub.substring(0, digit) != "") ? Long.parseLong(sub.substring(0, digit)) : -1;
            boolean inc1 = (num1 + num2 == sum1);
            boolean inc0 = (num1 + num2 == sum2);
            if (inc1) {
                if (digit + 1 < sub.length() - 1) return rec(sub.substring(digit + 1, sub.length()), n2, sub.substring(0, digit + 1), digit + 1);
                else return true;
            }
            else if (inc0) {
                if (digit < sub.length() - 1) return rec(sub.substring(digit, sub.length()), n2, sub.substring(0, digit), digit);
                else return true;
            }
            else return false;
        }
    }
    public static void main(String[] args) {
        String n = "1235813";
        System.out.println(isAdditiveSequence(n));
    }
}