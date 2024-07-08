public class Main {
    public static int search(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] >= arr[left]) {
                if (key >= arr[left] && key < arr[mid]) right = mid - 1;
                else left = mid + 1;
            }
            else {
                if (key > arr[mid] && key <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        System.out.println("Hello world!");
    }
}