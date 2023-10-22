public class min_max {
    public static void main(String[] args) {
        int[] arr={3, 2, 1, 56, 10000, 167};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min) min=arr[i];
        }
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        System.out.println(min);
        System.out.println(max);
    }
}
