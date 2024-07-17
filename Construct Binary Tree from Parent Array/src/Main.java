import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left, right;
        Node(int key) {
            data = key;
            left = right = null;
        }
    }
    public Node createTree(int[] parent) {
        List<Node> parentList = new ArrayList<>();
        for(int i = 0; i < parent.length; i++) parentList.add(new Node(i));
        Node root = null;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == -1) root = parentList.get(i);
            else {
                Node par = parentList.get(parent[i]);
                Node child = parentList.get(i);
                if(par.left == null) par.left = child;
                else par.right = child;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        int[] parent = {-1, 0, 0, 1, 1, 3,5};
        System.out.println("Hello world!");
    }
}