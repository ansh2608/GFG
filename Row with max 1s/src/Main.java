public class Main {
    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int max_count = 0;
        int row_index = -1;
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<m; j++){
                if(arr[i][j] == 1) count++;
            }
            if(count > max_count){
                max_count = count;
                row_index = i;
                if(max_count == m) break;
            }
        }
        return row_index;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}