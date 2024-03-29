import java.util.*;

public class Main {
    public static boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        for(ArrayList<Integer> al: adj) if(al.size()%2!=0) return  false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}