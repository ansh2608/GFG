public class Main {
    public static String pattern(int[][] arr) {
        int n=arr.length,m=arr[0].length;
        for(int i=0;i<n;i++) {
            boolean rowpalindrome=true;
            for(int j=0;j<=m/2;j++) {
                if(arr[i][j]!=arr[i][m-1-j]) {
                    rowpalindrome=false;
                    break;
                }
            }
            if(rowpalindrome) return i+" R";
        }
        for(int i=0;i<n;i++) {
            boolean colpalindrome=true;
            for(int j=0;j<=m/2;j++) {
                if(arr[j][i]!=arr[m-1-j][i]) {
                    colpalindrome=false;
                    break;
                }
            }
            if(colpalindrome) return i+" C";
        }
        return "-1";
    }

    public static void main(String[] args) {
        int[][] arr =  {{1, 0, 0}, {0, 1, 0}, {1, 1, 0}};
        System.out.println(pattern(arr));
    }
}