import java.util.Scanner;

public class Jenga_Night {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if (x>=n && (n%x==0 || x%n==0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
