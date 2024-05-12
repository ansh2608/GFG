public class Main {
    static int minSteps(int d) {
        int step=0;
        int sum=0;
        while(sum<d || (sum-d)%2!=0){
            step++;
            sum+=step;

        }
        return step;
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(minSteps(n));
    }
}