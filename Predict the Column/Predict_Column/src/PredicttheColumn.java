public class PredicttheColumn {
    static int columnWithMaxZeros(int[][] arr, int n){
        int count=0;
        int x=0;
        int index=-1;
        int j=0;
        for(int i=0; i<n;i++) {
            count = 0;
            for (j = 0; j < n; j++) {
                if (arr[j][i]==0) count++;
            }
            if (count > x) {
                x = count;
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        int n=arr.length;
        System.out.println(columnWithMaxZeros(arr,n));
    }
}
