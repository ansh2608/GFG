public class Main {
    public static class Node {
        int data;
        Node right,down;
        Node(int data){
            this.data = data;
            right = null;
            down = null;
        }
    }
    static Node construct(int[][] arr) {
        int n = arr.length;
        if (n == 0) return null;
        Node[][] nodeGrid = new Node[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nodeGrid[i][j] = new Node(arr[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1) nodeGrid[i][j].right = nodeGrid[i][j + 1];
                if (i < n - 1) nodeGrid[i][j].down = nodeGrid[i + 1][j];
            }
        }
        return nodeGrid[0][0];
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}