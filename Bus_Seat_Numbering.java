import java.util.Scanner;

public class Bus_Seat_Numbering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            if (n>=1 && n<=10) System.out.println("Lower Double");
            else if (n>=11 && n<=15) System.out.println("Lower Single");
            else if (n>=16 && n<=25) System.out.println("Upper Double");
            else if (n>=26 && n<=30) System.out.println("Upper Single");
        }
    }
}
