import java.util.ArrayList;

public class Main {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int x:arr){
            if(x>=0)positive.add(x);
            else negative.add(x);
        }
        int i=0,j=0,k=0;
        while(i<positive.size() && j<negative.size()){
            if(k%2==1)arr.set(k++,negative.get(j++));
            else arr.set(k++,positive.get(i++));
        }
        while(i<positive.size())arr.set(k++,positive.get(i++));
        while(j<negative.size())arr.set(k++,negative.get(j++));
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}