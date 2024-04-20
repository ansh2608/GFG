import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                // Add the element to the union and move to the next element in the first array
                if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                // Add the element to the union and move to the next element in the second array
                if(union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
            else{
                // If current elements in both arrays are same, add any one of them to the union
                if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                // Move to the next element in both arrays
                i++;
                j++;
            }
        }
        while(i < n){
            if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j < m){
            if(union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}