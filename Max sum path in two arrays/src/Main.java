import java.util.List;

public class Main {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int n = arr1.size()-1;
        int m = arr2.size()-1;
        int s1=0,s2=0;
        while(n>=0 && m>=0){
            if(arr1.get(n).equals(arr2.get(m))){
                int max= Math.max(s1,s2);
                s1 = max+arr1.get(n);
                s2 = max+arr1.get(n);
                n--;
                m--;
            }
            else if(arr1.get(n)>arr2.get(m)) {
                s1 +=arr1.get(n);
                n--;
            }
            else{
                s2+=arr2.get(m);
                m--;
            }
        }
        while(n>=0){
            s1 +=arr1.get(n);
            n--;
        }
        while(m>=0){
            s2+=arr2.get(m);
            m--;
        }
        return Math.max(s1,s2);
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 7, 10, 12} , arr2 = {1, 5, 7, 8};
        System.out.println("Hello world!");
    }
}