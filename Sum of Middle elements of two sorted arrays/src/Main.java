import java.util.*;

public class Main {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int res=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr1) list.add(num);
        for(int num:arr2) list.add(num);
        Collections.sort(list);
        int mid=(list.size()-1)/2;
        return list.get(mid)+list.get(mid+1);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 10}, arr2 = {4, 5, 6, 9, 12};
        System.out.println("Hello world!");
    }
}