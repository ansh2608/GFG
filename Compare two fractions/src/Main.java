public class Main {
    public static String compareFrac(String str) {
        String [] num = str.split(", ");
        String [] num1 = num[0].split("/");
        String [] num2 = num[1].split("/");
        double ans1 = ((double)Integer.parseInt(num1[0]))/Integer.parseInt(num1[1]);
        double ans2 = ((double)Integer.parseInt(num2[0]))/Integer.parseInt(num2[1]);
        if(ans1 == ans2) return "equal";
        else if(ans1 < ans2) return num[1];
        return num[0];
    }
    public static void main(String[] args) {
        String str = "5/6, 11/45";
        System.out.println(compareFrac(str));
    }
}