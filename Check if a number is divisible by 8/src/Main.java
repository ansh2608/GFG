public class Main {
    public static int DivisibleByEight(String s){
        if (s.isEmpty()) return -1;
        else if (s.length()<=3) {
            int x=Integer.parseInt(s);
            if (x%8==0) return 1;
            else return -1;
        }
        else {
            String ans=s.substring(s.length()-3);
            int x=Integer.parseInt(ans);
            if (x%8==0) return 1;
            else return -1;
        }
    }
    public static void main(String[] args) {
        String s = "16";
        System.out.println(DivisibleByEight(s));
    }
}