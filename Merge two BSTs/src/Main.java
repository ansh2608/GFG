import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left, right;
        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root1, sortedList);
        inOrderTraversal(root2, sortedList);
        sortedList.sort(Integer::compareTo);
        return sortedList;
    }

    private void inOrderTraversal(Node root, List<Integer> sortedList) {
        if (root == null) return;
        inOrderTraversal(root.left, sortedList);
        sortedList.add(root.data);
        inOrderTraversal(root.right, sortedList);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}