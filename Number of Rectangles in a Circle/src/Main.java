public class Main {
    public static int rectanglesInCircle(int r) {
        int count =0;
        int d=2*r;
        int area=(int) (3.14*r*r);
        int max=d-1;
        for(int i=1;i<=max;i++){
            for(int j=1;j<=max;j++){
                if(i*j<=area && (Math.pow(d,2)>=(Math.pow(i,2)+Math.pow(j,2)))){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int r=1;
        System.out.println(rectanglesInCircle(r));
    }
}