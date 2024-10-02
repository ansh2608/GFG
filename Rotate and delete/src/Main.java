import java.util.ArrayList;

public class Main {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int n=arr.size();
        int k=1;
        int h=1;
        while(k<=n/2){
            int l=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            arr.add(0,l);
            arr.remove(arr.size()-k);
            k++;
        }
        return arr.get(0);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}