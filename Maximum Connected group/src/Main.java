import java.util.*;

public class Main {
    public static int MaxConnection(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int path = -1;
        int key = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    map.put(key,max(grid, visited, i, j,key));
                    key++;
                }
            }
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    int len = 0;
                    HashSet<Integer> set = new HashSet<>();
                    if(i - 1 >= 0) set.add(grid[i-1][j]);
                    if(i + 1 < grid.length) set.add(grid[i+1][j]);
                    if(j - 1 >= 0) set.add(grid[i][j-1]);
                    if(j + 1 < grid[0].length) set.add(grid[i][j+1]);
                    for(Integer k:set) len+=map.get(k);
                    path = Math.max(path,len);
                }
            }
        }
        if(path == -1) return grid.length * grid[0].length;
        return path+1;
    }
    public static int max(int[][]grid, boolean[][]visited, int i, int j,int key){
        if(i < 0|| j < 0|| i > grid.length-1 || j > grid[0].length-1||visited[i][j] ||grid[i][j]==0) return 0;
        visited[i][j] = true;
        grid[i][j]=key;
        int path = 0;
        path += max(grid,visited,i-1,j,key);
        path += max(grid,visited,i+1,j,key);
        path += max(grid,visited,i,j+1,key);
        path += max(grid,visited,i,j-1,key);
        return 1+path;
    }
    public static void main(String[] args) {
        int[][] grid = {{1, 1}, {0, 1}};
        System.out.println(MaxConnection(grid));
    }
}