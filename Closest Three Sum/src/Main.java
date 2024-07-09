import java.util.Arrays;

public class Main {
    public static int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int minSum=arr[0]+arr[1]+arr[arr.length-1];
        for(int i =0;i<arr.length-2;i++) {
            int start=i+1;
            int end= arr.length-1;
            while(start<end) {
                int sum =  arr[i]+arr[start]+arr[end];
                int diff = Math.abs(sum-target);
                if(diff<Math.abs(minSum-target)) minSum=sum;
                else if(diff==Math.abs(minSum-target) && sum>minSum) minSum=sum;
                if(sum<target) start++;
                else end--;
            }
        }
        return minSum;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 9, 8, 3, 1, 1};
        int target = 2;
        System.out.println(threeSumClosest(arr,target));
    }
}