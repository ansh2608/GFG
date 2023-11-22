import java.util.*;
public class SymmetricTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static boolean isSymmetric(Node root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(Node nodeA, Node nodeB) {
        if (nodeA == null && nodeB == null) return true;
        if (nodeA == null || nodeB == null || nodeA.data != nodeB.data) return false;
        return isMirror(nodeA.left, nodeB.right) && isMirror(nodeA.right, nodeB.left);
    }
    public static void main(String[] args) {

    }
}
