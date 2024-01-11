import java.util.Scanner;

public class Water_Filling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int b3=sc.nextInt();
            if ((b1==0 && b2==0) || (b2==0 && b3==0) || (b1==0 && b3==0)) System.out.println("Water filling time");
            else System.out.println("Not now");
        }
    }
}
