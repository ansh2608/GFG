public class Main {
    public int maxStep(int arr[]) {
        int max = 0, c=0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1]<arr[i]) c++;
            else {
                max = Math.max(max,c);
                c = 0;
            }
        }
        max = Math.max(max,c);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}