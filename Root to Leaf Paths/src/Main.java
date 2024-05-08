import java.util.ArrayList;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        findPaths(root, currentPath, paths);
        return paths;
    }

    private static void findPaths(Node node, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> paths) {
        if (node == null) return;
        currentPath.add(node.data);
        if (node.left == null && node.right == null) {
            paths.add(new ArrayList<>(currentPath));
        } else {
            findPaths(node.left, currentPath, paths);
            findPaths(node.right, currentPath, paths);
        }
        currentPath.remove(currentPath.size() - 1);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}