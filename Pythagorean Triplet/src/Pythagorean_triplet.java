import java.util.Arrays;

public class Pythagorean_triplet {
    static boolean checkTriplet(int[] arr, int n){
        int[] sq=new int[n];
        for (int i=0;i<n;i++){
            sq[i]=arr[i]*arr[i];
        }
        Arrays.sort(sq);
        for (int i=n-1;i>=0;i--){
            int j=0,k=i-1;
            while (j<k){
                if((sq[j]+sq[k])==sq[i]){
                    return true;
                }
                else if(sq[i]>(sq[j]+sq[k])){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int N = 24;
        int[] Arr = {14,17,4,4,1,9,25,12,4,9,18,15,12,2,3,13,16,17,15,6,5,20,14,8};
        System.out.println(checkTriplet(Arr,N));
    }
}
