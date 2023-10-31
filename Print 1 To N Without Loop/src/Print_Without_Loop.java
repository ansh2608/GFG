public class Print_Without_Loop {
    static void print(int N){
        if (N==0) return;
        print(N-1);
        System.out.print(N+" ");
    }
    public static void main(String[] args) {
        int n=10;
        print(n);
    }
}
