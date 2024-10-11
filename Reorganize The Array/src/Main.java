import java.util.*;

public class Main {
    public List<Integer> rearrange(List<Integer> arr) {
        for(int i=0;i<arr.size();i++){
            while(arr.get(i)!=-1 && arr.get(i)!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(temp));
                arr.set(temp,temp);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}