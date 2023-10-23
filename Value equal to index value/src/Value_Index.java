import java.util.ArrayList;


public class Value_Index {

    public static void main(String[] args) {
        int[] arr={15,2,7,9,15};
        ArrayList<Integer> A=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1){
                A.add(arr[i]);
            }
        }
        System.out.println(A);
    }
}
