import java.util.*;
public class Main {
    public static int MinimumEffort(int rows, int columns, int[][] heights) {
        int[][] effort = new int[rows][columns];
        for (int[] row : effort) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0}); // {effort, row, col}
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currEffort = curr[0], row = curr[1], col = curr[2];

            if (row == rows - 1 && col == columns - 1) {
                return currEffort;
            }

            if (currEffort > effort[row][col]) {
                continue; // Skip if we've already found a better effort for this cell
            }

            for (int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                    int newEffort = Math.max(currEffort, Math.abs(heights[newRow][newCol] - heights[row][col]));
                    if (newEffort < effort[newRow][newCol]) {
                        effort[newRow][newCol] = newEffort;
                        pq.offer(new int[]{newEffort, newRow, newCol});
                    }
                }
            }
        }

        return -1; // No path found
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}