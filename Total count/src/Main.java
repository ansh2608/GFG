public class Main {
    int totalCount(int k, int[] arr) {
        int n= arr.length;
        int newArr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            int num;
            if((arr[i] % k) == 0){
                num =  (arr[i] / k);
                newArr[i] = num;
            }
            else{
                num =  (arr[i] / k);
                newArr[i] = num + 1;
            }
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += newArr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}