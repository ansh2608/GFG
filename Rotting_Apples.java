import java.util.*;

public class Rotting_Apples {
    public static int minTimeToRot(int[][] grid, int n, int m) {
        int[][] visited = new int[n][m];
        Queue<int[]> rottenQueue = new LinkedList<>();
        int freshOrangeCount = 0;
        int minutes = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = grid[i][j];
                if (visited[i][j] == 2) rottenQueue.offer(new int[]{i, j});
                if (visited[i][j] == 1) freshOrangeCount++;
            }
        }
        if (freshOrangeCount == 0) return 0;
        if (rottenQueue.isEmpty()) return -1;
        int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        while (!rottenQueue.isEmpty()) {
            int size = rottenQueue.size();
            while (size-- > 0) {
                int[] cell = rottenQueue.poll();
                int x = cell[0], y = cell[1];
                for (int[] dir : directions) {
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if (i >= 0 && i < n && j >= 0 && j < m && visited[i][j] == 1) {
                        visited[i][j] = 2;
                        freshOrangeCount--;
                        rottenQueue.offer(new int[]{i, j});
                    }
                }
            }
            minutes++;
        }
        if (freshOrangeCount == 0) return minutes;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                int x = grid[i][j];
                assert (x == 0 || x == 1 || x == 2);
            }
        }
        System.out.println(minTimeToRot(grid, n, m));
        sc.close();
    }
}
