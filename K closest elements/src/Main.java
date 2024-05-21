public class Main {
    int binarySearch(int [] arr,int key){

        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid  = low + (high - low)/2;
            if(arr[mid]<key){
                low = mid +1;
            } else if(arr[mid]>key){
                high = mid-1;
            } else{
                return mid;
            }
        }
        return high;
    }
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here

        int resultArr[] = new int[k];
        int requiredIndex = binarySearch(arr,x);
        int right = requiredIndex+1;
        int left =  requiredIndex;
        int start = 0;
        if(requiredIndex==-1){
            right = 0;
            requiredIndex = 0;
        }
        if(arr[requiredIndex]==x){
            left = requiredIndex-1;
        }
        while(k>0 && left>-1 && right<arr.length){
            int leftDiff = Math.abs(x-arr[left]);
            int rightDiff = Math.abs(x-arr[right]);
            if(leftDiff<rightDiff){
                resultArr[start++] = arr[left--];
            } else {
                resultArr[start++] = arr[right++];
            }
            k--;
        }
        while(k>0 && left>-1){
            resultArr[start++] = arr[left--];
            k--;
        }
        while(k>0 && right<arr.length){
            resultArr[start++] = arr[right++];
            k--;
        }
        return resultArr;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}