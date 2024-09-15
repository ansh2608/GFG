public class Main {
    public static class Node {
        Node left, right;
        int data;
        Node(int d) {
            data = d;
            left = right = null;
        }

    }
    Node head = null, lastNode = null;
    void help(Node root){
        if(root==null)return;
        help(root.left);
        if(head==null)head=root;
        if(lastNode!=null)lastNode.right=root;
        root.left=lastNode;
        lastNode=root;
        help(root.right);
    }
    Node bToDLL(Node root){
        help(root);
        return head;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}